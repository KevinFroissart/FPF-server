FROM debian:buster
ENV DEBIAN_FRONTEND noninteractive
RUN apt-get update \
 && apt-get install -y openjdk-8-jdk \
 && apt-get clean
ADD . /app/
WORKDIR /app/
RUN . gradlew bootJar
EXPOSE 8080
CMD java -jar /app/build/libs/server-0.0.1.jar
