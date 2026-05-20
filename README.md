# ⚡ Pokémon Search Engine

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

---

# 🧠 Architecture

Frontend (React)  
&nbsp;&nbsp;&nbsp;&nbsp;↓ Axios API Call  
Backend (Spring Boot REST API)  
&nbsp;&nbsp;&nbsp;&nbsp;↓  
Caffeine Cache Layer  
&nbsp;&nbsp;&nbsp;&nbsp;↓  
PokeAPI (External API)  

---

# ⚡ Caching Flow

1. User searches Pokémon name  
2. Backend checks cache first  
3. If found → returns cached response ⚡  
4. If not found → calls PokeAPI  
5. Stores result in cache for future use  

---

# 📡 API Endpoint

GET `/api/pokemon/{name}`

Example:  
http://localhost:8080/api/pokemon/pikachu  

---

# ❌ Error Handling

- Invalid Pokémon name handled properly  
- Global exception handler implemented  
- Returns clean JSON error response  

Example response:

```json
{
  "message": "Pokemon not found: xyz",
  "status": "ERROR",
  "timestamp": "2026-05-20T10:30:00"
}