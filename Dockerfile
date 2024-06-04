# Use a base image that has Java
FROM openjdk:17-jdk-alpine

# Set the working directory
WORKDIR /app

# Copy the JAR file into the container
COPY target/polo-0.0.1-SNAPSHOT.jar polo.jar

# Expose the port your application runs on
EXPOSE 8083

# Command to run the JAR file
ENTRYPOINT ["java", "-jar", "polo.jar"]