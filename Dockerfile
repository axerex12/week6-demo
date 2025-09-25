FROM maven:latest
LABEL authors="axerex"

WORKDIR /app

# Copy pom.xml first for better layer caching
COPY pom.xml /app/

# Copy source code
COPY src /app/src

# Build the application
RUN mvn clean package -DskipTests

# List the target directory contents for debugging
RUN ls -la target/

# Run the application
CMD ["java", "-jar", "target/TemperatureConverter.jar"]