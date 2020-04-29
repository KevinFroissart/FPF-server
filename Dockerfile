FROM openjdk:8-alpine
ADD . /app/
WORKDIR /app/

RUN chmod +x ./gradlew &&\ 
    ./gradlew bootJar

EXPOSE 8080
CMD java -jar /app/build/libs/server-0.0.1.jar
