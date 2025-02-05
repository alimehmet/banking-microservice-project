# Microservice Project

This project is a microservice-based application built with Spring Boot for the backend and React for the frontend. It consists of three backend services (`notification-service`, `transaction-service`, `user-service`) and a frontend application.

## Table of Contents

- [Microservice Project](#microservice-project)
  - [Table of Contents](#table-of-contents)
  - [Backend Services](#backend-services)
    - [Common Configuration](#common-configuration)
    - [Notification Service](#notification-service)
    - [Transaction Service](#transaction-service)
    - [User Service](#user-service)
  - [Frontend Application](#frontend-application)
  - [Running the Project](#running-the-project)
    - [Prerequisites](#prerequisites)
    - [Running Backend Services](#running-backend-services)
    - [Running Frontend Application](#running-frontend-application)
  - [API Endpoints](#api-endpoints)
    - [User Service](#user-service-1)
  - [Technologies Used](#technologies-used)
  - [License](#license)

## Backend Services

### Common Configuration

All backend services use the following common configuration:

- Java 21
- Spring Boot 3.4.0
- PostgreSQL as the database
- Maven for build and dependency management

### Notification Service

The `notification-service` handles notifications within the application.

- **Main Class**: `com.bankingproject.microservice.MicroserviceApplication`
- **Dependencies**:
  - Spring Boot Actuator
  - Spring Boot Data JPA
  - Spring Boot Security
  - Spring Boot Web
  - PostgreSQL
  - Lombok

### Transaction Service

The `transaction-service` handles transactions within the application.

- **Main Class**: `com.bankingproject.microservice.MicroserviceApplication`
- **Dependencies**:
  - Spring Boot Actuator
  - Spring Boot Data JPA
  - Spring Boot Security
  - Spring Boot Web
  - PostgreSQL
  - Lombok

### User Service

The `user-service` handles user management within the application.

- **Main Class**: `com.bankingproject.microservice.MicroserviceApplication`
- **Dependencies**:
  - Spring Boot Actuator
  - Spring Boot Data JPA
  - Spring Boot Security
  - Spring Boot Web
  - PostgreSQL
  - Lombok

## Frontend Application

The frontend application is built with React and communicates with the backend services.

- **Main Components**:
  - `UserList`: Displays a list of users.
  - `AddUser`: Form to add a new user.
- **Dependencies**:
  - React
  - React Router DOM
  - Axios

## Running the Project

### Prerequisites

- Java 21
- Maven
- Node.js and npm
- PostgreSQL

### Running Backend Services

1. Navigate to each backend service directory (`notification-service`, `transaction-service`, `user-service`).
2. Run the following command to start the service:

./mvnw spring-boot:run

### Running Frontend Application

1. Navigate to the frontend directory.
2. Install the dependencies:

npm install

3. Start the frontend application:

npm start

### API Endpoints
User Service
Create User: POST /api/users
Get All Users: GET /api/users

### Technologies Used
### Backend:
Spring Boot
Spring Security
Spring Data JPA
PostgreSQL
Lombok
Maven

### Frontend:
React
React Router DOM
Axios

