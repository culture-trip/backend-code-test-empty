ARG JAVA_VERSION=11.0.5
FROM openjdk:${JAVA_VERSION}-jre-stretch
ARG JAVA_MAJOR_VERSION=8

EXPOSE 8080

RUN mkdir -p /app/
COPY ./target/article-service.jar /app/article-service.jar

CMD ["java", "-jar", "/app/article-service.jar"]
