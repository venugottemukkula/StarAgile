FROM openjdk:11
MAINTAINER staragile.venu
port: 9091
COPY target/docker-message-server-1.0.0.jar message-server-1.0.0.jar
ENTRYPOINT ["java","-jar","/message-server-1.0.0.jar"]