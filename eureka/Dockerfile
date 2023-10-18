FROM adoptopenjdk/openjdk11:jdk-11.0.2.9-slim as build

# Installation de Maven
RUN apt-get update && apt-get install -y maven

WORKDIR /opt

# Copie du code source et du fichier POM
COPY src /opt/src
COPY pom.xml /opt

# Construction du projet avec Maven
RUN mvn -f /opt/pom.xml clean package -DskipTests

# Copie du fichier JAR généré
COPY target/*.jar /opt/app.jar

ENTRYPOINT exec java $JAVA_OPTS -jar app.jar
