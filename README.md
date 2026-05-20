# ⚡ Pokémon Search Engine (Full Stack Project)

A full-stack Pokémon search engine application built using Spring Boot and React JS.  
It fetches real-time Pokémon data from PokeAPI and displays it in a clean UI with caching and error handling.

---

# 🚀 Features

- Search Pokémon by name  
- Display Pokémon image  
- Show detailed Pokémon information:
  - Height  
  - Weight  
  - Base Experience  
  - Types  
  - Abilities  

- REST API integration with PokeAPI  
- Caching using Caffeine (faster repeated searches ⚡)  
- Global exception handling  
- Responsive and modern UI  
- Loading spinner for better UX  
- Clean JSON API responses  

---

# 🧠 Architecture

Frontend (React)
    ↓ Axios API Call
Backend (Spring Boot REST API)
    ↓
Caffeine Cache Layer
    ↓
PokeAPI (External API)

---

# 🛠️ Tech Stack

## Backend
- Java 17
- Spring Boot
- Maven
- RestTemplate
- Caffeine Cache

## Frontend
- React JS
- Axios
- HTML5
- CSS3
- JavaScript (ES6)

#🚀 How to Run Project

1️⃣ Clone Repository
git clone https://github.com/omkark-45/pokemon-search-engine.git
cd pokemon-search-engine

2️⃣ Backend Setup
cd backend/pokemonapi
mvn spring-boot:run
Backend runs on:
http://localhost:8080

3️⃣ Frontend Setup
cd frontend
npm install
npm start

Frontend runs on:
http://localhost:3000

⚡ Important Notes
Start backend first (port 8080)
Then start frontend (port 3000)
Ensure both are running together
👨‍💻 Author

Omkar Khose
Full Stack Java Developer (Spring Boot + React)

---

# 📡 API Endpoint

GET /api/pokemon/{name}

Example:
http://localhost:8080/api/pokemon/pikachu

---

# ❌ Error Handling

- Invalid Pokémon name handled properly  
- Global exception handler implemented  
- Returns clean JSON error response  

Example:
```json
{
  "message": "Pokemon not found: xyz",
  "status": "ERROR",
  "timestamp": "2026-05-20T10:30:00"
}



