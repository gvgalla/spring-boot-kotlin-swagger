FROM openjdk:12-jdk-alpine
WORKDIR /app
EXPOSE 9090
ADD ./build/libs/pams-0.0.1-SNAPSHOT.jar .
ENTRYPOINT ["java", "-jar", "pams-0.0.1-SNAPSHOT.jar"]