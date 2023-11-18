# Use an official OpenJDK 20 runtime as a base image
FROM openjdk:20-jdk


# Set the working directory in the container
WORKDIR /app

# Copy the application JAR file into the container
COPY target/logingestor-0.0.1-SNAPSHOT.jar /app.jar

# Expose the port that your Spring Boot application will run on
EXPOSE 3000

# Define the command to run your application
CMD ["java", "-jar", "app.jar"]
