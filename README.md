# Spring Boot Job CRUD

A simple CRUD (Create, Read, Update, Delete) application for managing job postings.  
This project was created as a learning exercise to explore **Spring Boot** and how to build **RESTful APIs**.

## Features

- Create, read, update, and delete job posts
- Manage job profiles, descriptions, required experience, and tech stacks
- REST API endpoints for all CRUD operations

## Technology Stack

- Java 17+
- Spring Boot
- Lombok
- Maven
- (Optional: H2 or MySQL for the database)

## Getting Started

### Prerequisites

- Java JDK installed
- Maven installed
- IDE (IntelliJ, Eclipse, VSCode)

### Run the Application

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/springboot-job-crud.git

2. Navigate to the project folder:
   ```bash
   cd springboot-job-crud

3. Build and run the application:
   ```bash
   mvn spring-boot:run
   
4. Access The API endpoints at http://localhost:8080/jobPosts

## API Endpoints

| Method | Endpoint       | Description             |
| ------ | -------------- | ----------------------- |
| GET    | /jobPosts      | Get all job posts       |
| GET    | jobPosts/{postId} | Get a specific job post |
| POST   | /jobPosts      | Create a new job post   |
| PUT    | jobPosts/{postId} | Update a job post       |
| DELETE | jobPosts/{postId}| Delete a job post       |

## License 
This project is for learning purposes and is open-source