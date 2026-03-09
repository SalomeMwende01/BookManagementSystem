# Book Management System

## Project Description
The Book Management System is a Spring Boot web application that allows users to manage a collection of books.  
Users can add, update, delete, view, and search for books through a simple web interface.

This project demonstrates the use of:
- Spring Boot
- Spring MVC
- Thymeleaf
- Spring Data JPA
- MariaDB Database

---

## Features

- Add a new book
- View all books
- Update book details
- Delete books
- Search books by title
- Clean and responsive user interface

---

## Technologies Used

- Java
- Spring Boot
- Thymeleaf
- MariaDB
- Maven
- Spring Tool Suite (STS)

---

## Project Structure

```
src
 └── main
     ├── java/com/example/bookmanagement
     │     ├── controller
     │     ├── model
     │     ├── repository
     │     └── service
     │
     └── resources
           ├── templates
           ├── static
           └── application.properties
```

---

## Database Configuration

The project uses a MariaDB database.

Example configuration in `application.properties`:

```
spring.datasource.url=jdbc:mysql://localhost:3306/bookdb
spring.datasource.username=root
spring.datasource.password=yourpassword

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

## How to Run the Project

1. Clone the repository

```
git clone https://github.com/SalomeMwende01/BookManagementSystem.git
```

2. Open the project in **Spring Tool Suite (STS)**

3. Ensure MariaDB is running and the database is created.

4. Run the Spring Boot application:

```
mvn spring-boot:run
```

5. Open your browser and go to:

```
http://localhost:8080
```

---

## Author

Student Name: *Salome Mwende*  
Course: *COMP 307: Web Programming II*

---

## Notes

This project was developed as part of a coursework assignment to demonstrate CRUD operations using Spring Boot.
