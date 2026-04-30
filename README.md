# 📍 Placely

**Placely** is a modern, full-stack platform designed to help users discover essential local services—from boutique hotels to healthcare clinics—in major metropolitan areas. 

More than just a directory, Placely serves as a vibrant social hub. It allows users to interact with posts from fellow travelers and local businesses in a community-driven environment. By utilizing a **hybrid data layer**, the platform seamlessly aggregates real-time data from the Google Places API alongside a custom, internal user-review system.

---

## 🚀 Tech Stack

**Backend**
* Java 21 (Spring Boot 3.x)
* Spring Security (JWT Authentication)
* Spring Data JPA
* H2 Database (File-Based)

**Frontend**
* React (Vite + TypeScript)
* React-Spring (Physics-based UI animations)

**Integrations**
* Google Places API (Real-time photos, ratings, and location data)

---

## ✨ Key Features

* **City & Service Discovery:** Browse supported metropolitan areas and intuitively filter venues by category (e.g., Hotels, Restaurants, Clinics).
* **Hybrid Data Layer:** A highly scalable architecture that seamlessly merges static internal database records with live API data (photos, reviews, and ratings) from Google.
* **Social Community Hub:** A dedicated social media feed where users can create posts, share travel experiences, and interact with updates from businesses and other travelers.
* **Robust User System:** Secure JWT authentication allowing users to manage profiles, write custom reviews, and rate locations directly within the platform.
* **Fluid UI Experience:** High-performance, physics-based animations via React-Spring to deliver a premium, responsive user experience.

---

## 🛠️ Database Setup

The project uses an H2 Database in **File-Based Mode** with Auto-Server enabled. This allows you to view and interact with the database via IntelliJ or DBeaver while the application is running.

* **JDBC URL:** `jdbc:h2:file:./data/placely;AUTO_SERVER=TRUE`
* **User:** `sa`
* **Password:** `password`
* **H2 Console:** [http://localhost:8080/h2-console](http://localhost:8080/h2-console)

> **Note:** The database files are stored locally in the `backend/data/` directory and are ignored by Git. When cloning this repository, you will start with a fresh, empty database.

---

## 💻 Getting Started
