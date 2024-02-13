FROM openjdk:14-jdk-alpine
MAINTAINER Loginov Yuriy
COPY target/ChatApplication-0.0.1-SNAPSHOT.jar chat.jar
ENTRYPOINT ["java","-jar","/chat.jar"]