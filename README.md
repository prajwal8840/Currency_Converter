# Currency_Converter

# 💱 Currency Converter App

> A full-stack Currency Converter web application built using Spring Boot that provides real-time currency conversion using external exchange rate APIs.

---

## 🚀 Live Demo (Optional)
> Add your deployed link here (AWS / Render / Railway)

---

## 📌 Overview

This project allows users to convert currency values between different countries using real-time exchange rates. It demonstrates backend API integration, clean architecture, and frontend interaction.

---

## ✨ Features

✅ Real-time currency conversion  
✅ RESTful API built with Spring Boot  
✅ External API integration  
✅ Simple UI for user interaction  
✅ Clean layered architecture (Controller → Service → Model)  
✅ Error handling for invalid inputs  

---

## 🛠️ Tech Stack

### 🔹 Backend
- Java  
- Spring Boot  
- REST API  
- Jackson (JSON parsing)  

### 🔹 Frontend
- HTML  
- CSS  
- JavaScript (Fetch API)  

### 🔹 Tools & Platforms
- Eclipse IDE  
- Maven  
- Git & GitHub  

---

## 🏗️ Architecture

User (Browser)
↓
Frontend (HTML + JS)
↓
Spring Boot Controller
↓
Service Layer (Business Logic)
↓
External Currency API 🌐
↓
Response → UI


---

## 📂 Project Structure


currency-converter/
│
├── src/main/java/com/example/currencyconverter
│ ├── controller/
│ │ └── CurrencyController.java
│ │
│ ├── service/
│ │ └── CurrencyService.java
│ │
│ ├── model/
│ │ └── CurrencyResponse.java
│ │
│ └── CurrencyConverterApplication.java
│
├── src/main/resources
│ └── static/
│ └── index.html
│
├── pom.xml
└── README.md




## 🔗 API Endpoints

### Convert Currency


GET /api/currency/convert


### Query Parameters

| Parameter | Description | Example |
|----------|------------|--------|
| from | Base currency | USD |
| to | Target currency | INR |
| amount | Amount to convert | 100 |

### Example Request


http://localhost:8080/api/currency/convert?from=USD&to=INR&amount=100


### Example Response


8300.45


---

## ⚙️ How to Run Locally

### 1️⃣ Clone Repository


git clone https://github.com/your-username/currency-converter.git


### 2️⃣ Open in Eclipse

- Import as Maven Project

### 3️⃣ Run Application

Run:

CurrencyConverterApplication.java


### 4️⃣ Access Application


http://localhost:8080



## 🌐 External API Used

- https://open.er-api.com  
Provides real-time exchange rate data.



## 📸 Screenshots (Add Later)

> Add UI screenshots here for better presentation



## 🚀 Future Enhancements

🔹 Add all currency dropdown dynamically  
🔹 Implement React frontend  
🔹 Add conversion history  

