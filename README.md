# Item Management REST API 🚀

A production-ready **Spring Boot REST API** to manage items with full CRUD operations, Swagger documentation, Docker support, and live cloud deployment.

## 🌐 Live Demo
🔗 https://item-api-github-ready.onrender.com/swagger-ui/index.html

## 📂 GitHub Repository
🔗 https://github.com/poojagv22/item-api-github-ready

---

## ✨ Features

✅ Add item  
✅ Get all items  
✅ Get item by ID  
✅ Delete item  
✅ RESTful design  
✅ Input validation  
✅ Global exception handling  
✅ Swagger/OpenAPI documentation  
✅ Dockerized deployment  
✅ Hosted on Render  

---

## 🛠 Tech Stack

- Java 17+
- Spring Boot
- Maven
- Swagger / OpenAPI 3
- Docker (multi-stage build)
- Render (Cloud hosting)

---

## 📌 API Endpoints

| Method | Endpoint | Description |
|--------|-----------|-------------|
| GET | /items | Get all items |
| POST | /items | Create new item |
| GET | /items/{id} | Get item by ID |
| DELETE | /items/{id} | Delete item |

---

## 📘 Swagger Documentation

Interactive API testing available at:

👉 `/swagger-ui/index.html`

You can directly test APIs from the browser.

---

## 🐳 Run with Docker

### Build image
```bash
docker build -t item-api .
