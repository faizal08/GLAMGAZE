<div align="center">

# 🕶️ GLAMGAZE 
### *Premium Eyewear E-Commerce Solution*

[![Java](https://img.shields.io/badge/Java-17-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)](https://spring.io/projects/spring-boot)
[![PostgreSQL](https://img.shields.io/badge/PostgreSQL-Shared-316192?style=for-the-badge&logo=postgresql&logoColor=white)](https://www.postgresql.org/)
[![AWS](https://img.shields.io/badge/Deployment-AWS_EC2-232F3E?style=for-the-badge&logo=amazon-aws&logoColor=white)](https://aws.amazon.com/)

**A Robust, Multi-Module Java Full-Stack Application**
</div>

---

## 📖 Project Overview
**GLAMGAZE** is a professional-grade e-commerce platform dedicated to eyewear. Built using the **Spring Boot** ecosystem, this project demonstrates a highly scalable **Multi-Module Maven Architecture**. It separates core business logic from the user-facing storefront and administrative dashboard, ensuring clean code and modularity.

---

## 🏗️ Architecture Design
The project is structured into three primary modules to maintain a clean **Separation of Concerns**:

* **📂 Library:** The heart of the application. Contains shared `Entities`, `Repositories`, and `DTOs`. This module is a dependency for both Admin and Customer modules.
* **📂 Admin:** A secure management portal. Features include inventory control, category management, and order tracking.
* **📂 Customer:** The premium storefront. Includes product discovery, cart management, and a secure checkout process.

---

## ✨ Key Features

### 👨‍💼 Admin Dashboard
* **Inventory Management:** Full CRUD operations for glasses and frames.
* **Category Logic:** Organize products by brand, style, or price point.
* **Security:** Role-based access control (RBAC) via **Spring Security**.

### 🛒 Customer Storefront
* **Dynamic Catalog:** Responsive product grid with real-time availability.
* **Shopping Cart:** Persistent cart management.
* **User Profiles:** Secure registration and order history tracking.

---

## 💻 Tech Stack

| Layer | Technology |
| :--- | :--- |
| **Backend** | Java 17, Spring Boot, Spring Data JPA, Spring Security |
| **Frontend** | Thymeleaf, SCSS, JavaScript, HTML5 |
| **Database** | PostgreSQL |
| **Build Tool** | Maven (Multi-module) |
| **DevOps** | Nginx, AWS EC2, Git |

---

## 🚦 Getting Started

### Prerequisites
* **JDK 17**
* **Maven 3.x**
* **PostgreSQL**

### Local Setup
1. **Clone the Repo:**
   ```bash
   git clone [https://github.com/faizal08/GLAMGAZE.git](https://github.com/faizal08/GLAMGAZE.git)
   cd GLAMGAZE
