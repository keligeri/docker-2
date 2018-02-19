FROM java:8
COPY build/libs/consumer-app-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 6397
RUN ["java", "-jar", "app.jar"]