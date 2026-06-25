# Spring boot chat application

💬 Chat App

A real-time chat application built using Spring Boot and WebSocket for seamless, bi-directional communication between users.
It features a responsive web interface created with HTML, CSS, and JavaScript for instant messaging.



https://github.com/user-attachments/assets/6ca26b8f-02fa-4381-a734-52f16f2992a0





🚀 Features

💬 Real-Time Messaging: Send and receive messages instantly using WebSocket connections.

👥 Multi-User Support: Multiple clients can connect and chat simultaneously.

🔄 Bi-Directional Communication: Enables continuous data flow between server and clients without refreshing.

🎨 Responsive Frontend: Built with HTML, CSS, and JavaScript for clean and simple UI.

⚙️ Spring Boot Backend: Manages sessions, message routing, and WebSocket endpoints efficiently.

🧰 Tech Stack
Layer	Technology
Frontend	HTML, CSS, JavaScript
Backend	Java, Spring Boot
Communication	WebSocket
Build Tool	Maven
Version Control	Git, GitHub

⚙️ Installation & Setup
1. Clone the repository
git clone https://github.com/owl-screen/Chat_app.git
cd Chat_app

2. Run the Backend
cd backend
./mvnw spring-boot:run


Backend starts on http://localhost:8080

3. Open the Frontend

Open the index.html file from the frontend/ folder in your web browser.
You can connect multiple browser tabs or devices to test real-time messaging.

🧩 How It Works

When a user sends a message, the frontend sends it through a WebSocket connection.

The Spring Boot server receives and broadcasts the message to all connected clients.

Each connected client instantly displays the new message — no page reload required.
