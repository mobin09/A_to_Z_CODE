# 1.Base image
FROM eclipse-temurin:23-jdk
# 2. Copy jar file
COPY target/*.jar app.jar
# 3. Expose port
EXPOSE 5003
# 4. Run application
ENTRYPOINT ["java", "-jar", "/app.jar"]