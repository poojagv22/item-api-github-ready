# Use Java 21
FROM eclipse-temurin:21-jdk

WORKDIR /app

# copy project
COPY . .

# build jar
RUN ./mvnw clean package -DskipTests || mvn clean package -DskipTests

# run jar
CMD ["java","-jar","target/item-api-0.0.1-SNAPSHOT.jar"]
