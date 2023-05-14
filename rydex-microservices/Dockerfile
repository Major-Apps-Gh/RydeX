
FROM maven:3.9-eclipse-temurin-19

WORKDIR /bezkoder-app
COPY . .
RUN mvn clean install

CMD mvn spring-boot:run

# FROM eclipse-temurin:17-jdk-focal
 #FROM maven:3.8.2-jdk-8
# WORKDIR /app
#FROM maven:3.8.5-openjdk-17 
# COPY .mvn/ .mvn
# COPY mvnw pom.xml ./
# RUN ./mvnw dependency:go-offline
 
# COPY src ./src
 
# CMD ["./mvnw", "spring-boot:run"]