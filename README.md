# 🚀 Spring Boot Mastery Journey

Welcome to my Spring Boot learning repository! This project serves as a comprehensive guide and code laboratory where I document my progress from the basics to advanced production-level optimizations.

## 🛠 Tech Stack
* **Language:** Java
* **Framework:** Spring Boot 3+
* **Data:** Spring Data JPA, Hibernate
* **Containerization:** Docker
* **Tools:** Maven, ModelMapper, Lombok

---

## 📋 Table of Contents

| # | Learning Module | Key Concepts |
| :--- | :--- | :--- |
| 01 | **Getting Started** | Roadmap and environment setup for Spring Boot. |
| 02 | **Project Initialization** | Creating and configuring the first Spring Boot application. |
| 03 | **Internal Architecture** | Understanding the internal request flow and DispatcherServlet. |
| 04 | **Dependency Injection (Part 1)** | Fundamental DI concepts and how Spring manages dependencies. |
| 05 | **Dependency Injection (Part 2)** | Advanced DI patterns and practical implementation. |
| 06 | **IoC Container** | Deep dive into Beans and the `ApplicationContext`. |
| 07 | **Bean Management** | Bean Lifecycle, Scopes, and the `@ComponentScan` mechanism. |
| 08 | **Project Structuring** | Implementing a standard and scalable project folder structure. |
| 09 | **Data Layers** | Differentiation between Entity, Domain Model, and DTO. |
| 10 | **Object Mapping** | Streamlining data transfer using `ModelMapper`. |
| 11 | **Controller Layer (Part 1)** | Handling REST requests and @RestController basics. |
| 12 | **Controller Layer (Part 2)** | Advanced request processing and ResponseEntities. |
| 13 | **Global Exception Handling** | Using `@ControllerAdvice` for robust error management. |
| 14 | **Automated Validation** | Implementing `spring-boot-starter-validation` for clean code. |
| 15 | **Best Practices** | Clean coding habits and avoiding common Spring pitfalls. |
| 16 | **JPA Performance Tuning** | Using Proxy entities to prevent redundant SELECTs during INSERTs. |
| 17 | **Dockerization** | Building and optimizing Docker images for production. |

---

## 🏗 Project Structure
* `src/main/java`: Source code organized by modules (Controller, Service, Repository, DTO).
* `src/main/resources`: Configuration files and static assets.
* `docker/`: Dockerfiles and container orchestration scripts.

## 🚀 How to Run
1.  **Clone the repo:**
    ```bash
    git clone [https://github.com/your-username/your-repo-name.git](https://github.com/your-username/your-repo-name.git)
    ```
2.  **Build the project:**
    ```bash
    ./mvnw clean install
    ```
3.  **Run the application:**
    ```bash
    ./mvnw spring-boot:run
    ```

---
**Author:** Nguyen Van Thinh Real  
*RMIT University Vietnam - Information Technology*