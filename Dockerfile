FROM gradle
ADD . /app/
WORKDIR /app/

RUN gradle bootJar

EXPOSE 8080
CMD ["java", "-jar", "/app/build/libs/server-0.0.1.jar"]
