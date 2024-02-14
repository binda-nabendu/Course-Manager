# Academic Course Management System

The Academic Course Management System is a web application designed to streamline and automate the process of managing student information and course registrations. It provides a user-friendly interface for authorized personnel to perform various tasks, including viewing student lists, creating new students, updating student information, managing course details, and configuring system settings.

## Features

- **Authorization:** Only authorized personnel can access the system, ensuring secure handling of sensitive student information.

- **Student Management:**
    - View the complete student list.
    - Create new students with detailed information, including student ID, name (first name, middle name, last name), gender, multiple phone numbers, email addresses, educational information (degree, institute name, GPA, passing year), and address details.
    - Update student profiles easily.
    - Filter students by ID or name for quick access to specific student information.

- **Course Management:**
    - Create and manage course information, including course code, title, and credits.
    - Configurable page for setting the maximum number of credits or courses that can be assigned to a student.

- **Course Registration:**
    - Authorize personnel can assign courses to students on the course registration page.
    - Search for a specific student.
    - Select preferred courses and save the assignments.
    - Receive confirmation messages for successful assignments.
    - Get error messages for any configuration-related issues.

## Technologies Used

### Frontend (Angular)

- Angular Framework
- TypeScript
- HTML/CSS
- Angular Material for UI components

### Backend (Spring Boot)

- Spring Boot Framework
- Java
- Spring Data JPA for data persistence
- Spring Security for authentication and authorization

## Getting Started

### Prerequisites

- Node.js and npm for Angular frontend
- Java Development Kit (JDK) for Spring Boot backend
- MySQL Database (or other databases as configured)

### Installation and Setup

1. **Frontend:**
    - Navigate to the `frontend` directory.
    - Run `npm install` to install dependencies.
    - Configure the API endpoint in the `environment.ts` file.
    - Run `ng serve` to start the Angular development server.

2. **Backend:**
    - Navigate to the `backend` directory.
    - Configure the database connection in `application.properties`.
    - Run the Spring Boot application.

3. **Access the Application:**
    - Open the browser and navigate to `http://localhost:4200` for the Angular frontend.
    - The Spring Boot backend will be running on `http://localhost:8080`.

## Usage

- Log in with authorized credentials.
- Explore the intuitive interface to manage students, courses, and system configurations.
- Easily assign courses to students and receive real-time feedback on successful assignments or configuration errors.

## Contributors

- Nabendu Bikash Binda

## License

This project is licensed under the [MIT License](LICENSE).
