FROM openjdk:8-jdk-alpine
LABEL Florent Kemdjeukeng <fkemdjeukeng@yahoo.fr>
COPY target/proxy-service-0.0.1-SNAPSHOT.jar ms-proxy-1.0.0.jar
ENTRYPOINT ["java", "-jar", "/ms-proxy-1.0.0.jar"]
EXPOSE 9999