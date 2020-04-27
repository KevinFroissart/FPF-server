FROM debian:buster
ENV DEBIAN_FRONTEND noninteractive
RUN apt-get update \
 && apt-get install -y openjdk-11-jdk maven \
 && apt-get clean
ADD . /app/
WORKDIR /app/
RUN mvn package -Dmaven.test.skip=true
EXPOSE 8080
CMD java -jar /app/target/server-1.0-SNAPSHOT.jar

