# 💬 Chati - Android AI Assistant
<div align="center">
  <img src="https://i.postimg.cc/L6dmQj6q/Chati.png" alt="Chati Logo" width="600" height="600" style="border-radius: 40px; box-shadow: 0px 0px 20px rgba(0, 241, 94, 0.5);">
  <br><br>
  <h3><b>CryptRo</b> is a cutting-edge Android application designed to track real-time cryptocurrency prices, analyze market trends, and manage your portfolio effortlessly.</h3>
</div>

![Language](https://img.shields.io/badge/Language-Kotlin-purple)
![UI](https://img.shields.io/badge/UI-Jetpack_Compose-blue)
![Architecture](https://img.shields.io/badge/Architecture-Clean_Arch_%2B_MVVM-green)
![AI](https://img.shields.io/badge/AI-Google_Gemini_Flash-orange)

**Chati** is a modern Android application demonstrating how to integrate **Google's Gemini AI** (specifically the 1.5 Flash model) into an Android app using **Jetpack Compose** and **Clean Architecture**.

This project was created for an **Android & AI Workshop** to showcase best practices in modern Android development.

## ✨ Features

* **Smart Chat:** Real-time conversation with Gemini 1.5 Flash.
* **Modern UI:** Built entirely with **Jetpack Compose** (Material 3).
* **Clean Architecture:** Separation of concerns (Presentation, Domain, Data).
* **Dependency Injection:** Using **Koin** for simple and effective DI.
* **Secure:** API Keys are managed via `local.properties` and `BuildConfig`.
* **Responsive:** Handles keyboard visibility and message scrolling smoothly.

## 🛠️ Tech Stack

* **Language:** Kotlin
* **UI Toolkit:** Jetpack Compose
* **Architecture:** MVVM + Clean Architecture
* **DI:** Koin
* **AI SDK:** Google Generative AI SDK for Android
* **Concurrency:** Coroutines & Flow

## 🚀 How to Run the Project (Important!)

Since this project uses a secure way to handle the API Key, you need to generate your own key to run the app.

### Step 1: Clone the Repo
```bash
git clone [https://github.com/Robert-x1/Chati_APP.git](https://github.com/Robert-x1/Chati_APP.git)
Step 2: Get a Gemini API Key
Go to Google AI Studio.

Click on Get API key.

Create a key for a new project.

Step 3: Configure the App
Open the project in Android Studio.

Locate the local.properties file in the root directory of the project.

Add the following line to the file (replace the value with your actual key):

Properties
sdk.dir=... (existing line)
GEMINI_API_KEY=AIzaSyDxxxxxxxxxxxxxxxxxxxxxxxxxxxx
Sync Project with Gradle Files.

Run the app! 📱

📂 Project Structure
This project follows Clean Architecture principles:

Plaintext
com.robert.chati
├── data             # Repository Implementation & API logic
│   └── repository
├── domain           # Interfaces & Models
│   ├── model
│   └── repository
├── presentation     # UI & ViewModels
│   ├── ChatScreen
│   └── ChatViewModel
└── di               # Koin Modules (Dependency Injection)
🤝 Contributing
This is a workshop demo project. Feel free to fork it and play around with the Gemini SDK capabilities.

👤 Author
Robert Romany

LinkedIn: [https://www.linkedin.com/in/robert-romany-dev/]

GitHub: [https://github.com/Robert-x1]
