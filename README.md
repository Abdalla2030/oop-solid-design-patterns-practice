# OOP, SOLID & Design Patterns Practice

This repository demonstrates a structured, hands-on implementation of Object-Oriented Programming (OOP), SOLID principles, and common Design Patterns using a Hotel Management System (HMS) case study.

---

## 📚 Course Reference

* 🎓 Course:
  https://www.udemy.com/course/oop-from-engineering-perspective/

* 👨‍🏫 Instructor:
  https://linkedin.com/in/sameh-muhammed-860570144/?skipRedirect=true
  
---

## 🚀 Project Overview

The project starts with a structured (procedural) implementation and is progressively refactored into a clean object-oriented design.

The system includes:

* Room management
* Reservation system (Cancelable / Uncancellable)
* Meal ordering
* Checkout service

---

## 🧠 Concepts Covered

### OOP Principles

* Encapsulation
* Inheritance
* Abstraction
* Polymorphism

---

### SOLID Principles

* Single Responsibility Principle (SRP)
* Interface Segregation Principle (ISP)
* Dependency Inversion Principle (DIP)

---

### Design Patterns

* Factory Method
* Factory Pattern
* Builder Pattern
* Singleton Pattern
* Strategy Pattern (via composition)

---

## ⚙️ Key Implementations

### 1. Inheritance & Polymorphism

* `Room` → `SingleRoom`, `DoubleRoom`, `SweetRoom`, `TripleRoom`
* `Reservation` → `CancelableReservation`, `UncancellableReservation`

---

### 2. Abstraction & ISP

#### ❌ Incorrect Design

```text
DataAccessManager (fat interface)
```

#### ✅ Correct Design

```text
RoomDataAccessManager
MenuDataAccessManager
```

---

### 3. Dependency Inversion (DIP)

* Business logic depends on interfaces instead of concrete implementations

---

### 4. Builder Pattern

* `RoomBuilder` for flexible object creation

---

### 5. Factory Pattern

* `RoomFactory` + `RoomType` for runtime object creation

---

### 6. Singleton Pattern

* `Hotel` class ensures single instance

---

### 7. Strategy Pattern (Composition)

* Implemented using `IMovable` in Bird example
* Demonstrates composition over inheritance

---

### 8. Separation of Concerns

* Business Logic → `management`
* Data Access → interfaces
* Display Layer →

  * `RoomDisplay`
  * `MenuDisplay`
  * Console implementations

---

### 9. Service Layer

* `CheckoutService` handles reservation checkout and room release

---

## 📂 Project Structure

```text
oop
 ├── model
 │   ├── room
 │   ├── reservation
 │   └── ...
 ├── management
 │   ├── abstraction
 │   │   ├── wrong
 │   │   └── correct
 ├── factory
 ├── builder
 ├── singleton
 ├── service
 └── util
```

---

## 📌 Notes

* The project demonstrates gradual refactoring from procedural code to a maintainable OOP design.
* Each concept is applied incrementally and validated through commits.
* Focus is on design quality, not just functionality.

---

## 🎓 Certificate

* https://www.udemy.com/certificate/UC-b015ebbd-2102-4446-8d28-22f3130f5f06/

 <img width="1182" height="866" alt="Screenshot 2026-05-03 025403" src="https://github.com/user-attachments/assets/afa97c49-a60c-45e1-aad9-0da8d21e5848" />


