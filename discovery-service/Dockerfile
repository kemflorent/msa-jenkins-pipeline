FROM openjdk:8-jdk-alpine
LABEL Florent Kemdjeukeng <fkemdjeukeng@yahoo.fr>
COPY target/discovery-service-0.0.1-SNAPSHOT.jar ms-discovery-1.0.0.jar
ENTRYPOINT ["java", "-jar", "/ms-discovery-1.0.0.jar"]
EXPOSE 8761