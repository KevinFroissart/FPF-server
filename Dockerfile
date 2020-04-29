FROM postgres
ENV POSTGRES_PASSWORD postgres
COPY init.sql /docker-entrypoint-initdb.d/
ADD . /app/
WORKDIR /app/

RUN apt-get update \
    && apt-get install -y openjdk-11-jdk \
    && apt-get clean \
    && chmod +x ./gradlew \ 
    && ./gradlew bootJar

EXPOSE 8080
CMD ["postgres"]
CMD ["java", "-jar", "/app/build/libs/server-0.0.1.jar"]
