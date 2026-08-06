# Spring Boot & React Chat Application

💬 A real-time, full-fledged messaging application featuring a responsive web user interface inspired by WhatsApp. Built with a React frontend and a Spring Boot backend utilizing WebSockets for seamless, bi-directional communication.

## 🚀 Features

- **Realtime Messaging:** Experience seamless, instant message delivery using WebSocket connections without page reloads.
- **Individual Messaging:** Send private, secure messages to other users.
- **Group Messaging:** Create, manage, and edit group chats to communicate with multiple users simultaneously.
- **Secure Authentication:** Securely access the application with a robust Login and Signup system.
- **Multi-User Support:** Multiple clients can connect, register accounts, and chat interactively at the same time.

## 🧰 Tech Stack

| Layer | Technology |
| :--- | :--- |
| **Frontend** | TypeScript, React, Material UI (MUI) |
| **State Management** | Redux, Thunk |
| **Backend** | Java, Spring Boot, Spring Security, Spring WebSocket, Spring Data JPA |
| **Database** | PostgreSQL |
| **Authentication** | JSON Web Token (JWT) |
| **Build Tool** | Maven |

## ⚙️ Installation & Setup

### Prerequisites
Ensure you have **Node.js (npm)**, **Java (JDK)**, and **Maven (mvn)** installed on your machine.

### Steps to Run Locally

1. **Clone the repository:**
   ```bash  
   git clone https://github.com
   cd Chat_app
   ```

2. **Setup the Frontend:**
   ```bash
   cd frontend
   npm install
   npm start
   ```
   *The frontend application will start running on `http://localhost:3000`.*

3. **Setup the Backend:**  
   Configure your database credentials in the Spring Boot `application.properties` file located inside the backend resources, then run:
   ```bash
   cd ../backend
   mvn clean install
   mvn spring-boot:run
   ```
   *The backend server will spin up on `http://localhost:8080`.*

4. **Access the Application:**
   * Open your browser and visit [http://localhost:3000](http://localhost:3000).
   * You can create your own account or log in with a sample predefined user:
      * **Email:** `luke.skywalker@test.com`
      * **Password:** `luke`

## 🧩 How It Works

1. When a user transmits a message, the React frontend passes the payload across an active WebSocket connection.
2. The Spring Boot backend interceptor validates the user session via JWT, processes the message routing, and persists it to the PostgreSQL database.
3. The server immediately broadcasts the payload to all designated active WebSocket subscribers, rendering updates dynamically via Redux state management.
