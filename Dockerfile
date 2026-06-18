FROM eclipse-temurin:21-jdk
MAINTAINER "Mr Sahil <4747>"
COPY target/Rest-Project-01.jar  /usr/app/
WORKDIR /usr/app/
EXPOSE 9090
ENTRYPOINT ["java", "-jar", "Rest-Project-01.jar"]
