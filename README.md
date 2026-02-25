# Inspection Spring Boot App

Minimal Spring Boot project (Maven) with Web MVC and PostgreSQL.

Prerequisites
- Java 17+
- Maven
- PostgreSQL running (create database `inspectiondb` or update `application.properties`)

Run

1. Build and run with Maven:

```bash
mvn spring-boot:run
```

2. Visit http://localhost:8080 to verify the health endpoint.

Configuration
- Edit `src/main/resources/application.properties` to set your PostgreSQL `url`, `username`, and `password`.
