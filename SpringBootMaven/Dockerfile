FROM alpine:latest

RUN apk add --no-cache openjdk21

RUN mkdir -p /opt/App

COPY /target/com.jagade-0.0.1-SNAPSHOT.jar /opt/App

EXPOSE 8081

ENTRYPOINT ["java", "-jar", "/opt/App/com.jagade-0.0.1-SNAPSHOT.jar"]
