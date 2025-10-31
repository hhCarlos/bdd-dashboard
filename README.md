### Correr el proyecto
mvn clean compile exec:java -Dexec.mainClass=org.bdd.dashboard.Main

### Limpia y genera jar
mvn clean package

java -jar target/bdd-dashboard-1.0-SNAPSHOT.jar

- Crear MANIFEST
  - jar xf target/bdd-dashboard-1.0-SNAPSHOT.jar META-INF/MANIFEST.MF
  - cat META-INF/MANIFEST.MF

Debería contener:
Main-Class: org.bdd.dashboard.Main

### jpackage
jpackage \                         
--input target \
--main-jar bdd-dashboard-1.0-SNAPSHOT.jar \
--main-class org.bdd.dashboard.Main \
--name "BDD Dashboard" \
--type app-image
