FROM openjdk:8-alpine

COPY target/uberjar/celestial-lights.jar /celestial-lights/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/celestial-lights/app.jar"]
