# Simple Math Web Application

This is a simple web application that allows users to perform basic addition operations using a frontend built with React and a backend built with Spring Boot.

## Repository

You can view or clone the repository here: [GitHub Repository](https://github.com/cocoshi98/simplemath)
You can run the command "git clone https://github.com/cocoshi98/simplemath.git" to clone the repository

## **Table of Contents**
- [Features](#features)
- [Prerequisites](#prerequisites)
- [Backend Setup](#backend-setup)
- [Frontend Setup](#frontend-setup)
- [How to Run](#how-to-run)
- [API Endpoints](#api-endpoints)
- [Technologies Used](#technologies-used)

---

## **Features**
✅ Perform addition of two numbers  
✅ Responsive user interface  
✅ REST API with Spring Boot  

---

## **Prerequisites**
Make sure you have the following installed:

- [Node.js](https://nodejs.org/) (for the frontend)
- [npm](https://www.npmjs.com/) (comes with Node.js) or [yarn](https://yarnpkg.com/)
- [Java 17](https://adoptium.net/) (for the backend)
- [Maven](https://maven.apache.org/)
- [Spring Boot](https://spring.io/projects/spring-boot)

---

## **Backend Setup**
1. Navigate to the backend directory: simplemath/backend
2. Run the command `mvn spring-boot:run`
3. You can test the API on Postman using:
    - Method: POST
    - Endpoint: /api/add
    - Description: Add two numbers
    - Example Request: `/api/add?a=5&b=3`
4. The expected response will be "8"

---

## **Frontend Setup**
1. Navigate to the frontend directory: simplemath/frontend
2. Run the command "npm install" to install dependencies
3. Run the command "npm start" to start the development server

---

## **Troubleshooting**
1. PORT Conflicts
- If port 8080 is in use, modify application.properties in the backend: server.port=9090
- If port 3000 is in use, start the frontend with: PORT=3001 npm start

---

## **License**
This project is open-source and available under the MIT License.

---

## **Author**
- Quah Joon Hui Conant
- Github: cocoshi98
- Email: conantquah@gmail.com

