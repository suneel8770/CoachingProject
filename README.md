# Java Fundamentals Assignment – Student Management System

## Author
**Suneel Soni**  
Subject: *Java Fundamentals Assignment – Suneel Soni*

---

## 1. Project Overview
This project demonstrates core Java fundamentals and OOP concepts through a fully functional **Student Management System**.  
The system includes proper package structure, OOP implementation, constructor handling, custom exceptions, interfaces, and a menu-driven console application for managing students, courses, and enrollments.

---

## 2. Learning Objectives Covered
This project fulfils all assignment learning objectives:

- Java Environment Setup (JDK, JRE, JVM)
- JVM architecture understanding (Class Loader, Runtime Areas, Execution Engine)
- OOP Principles:
    - Encapsulation
    - Inheritance
    - Polymorphism
    - Abstraction
- Constructor overloading, chaining, overriding
- Package creation and access modifiers
- Clean code principles
- Working Student Management mini-application

---

## 3. Environment Setup
### Steps Followed
1. Installed JDK (version used: **X.X**)
2. Configured environment variables:
    - `JAVA_HOME`
    - Updated `PATH`
3. Verified installation using:


4. Successfully compiled and executed the project.

*(Insert your screenshots here.)*

---

## 4. JVM Architecture Documentation
A separate PDF is included explaining:

- JVM Components
- Class Loader Subsystem
- Runtime Data Areas
- Execution Engine
- JIT Compiler vs Interpreter
- Bytecode execution process
- WORA principle (Write Once, Run Anywhere)

*(Attach your PDF in `/docs/jvm_report.pdf` or in the repository root.)*

---
## 5. Project Structure

Coaching Project/
├── src
│ └── main
│ └── java
│ └── com.studentmanagement
│ ├── entity
│ │ ├── Person.java
│ │ ├── Student.java
│ │ ├── GraduateStudent.java
│ │ ├── Course.java
│ │ └── Enrollment.java
│ ├── exception
│ │ ├── InvalidDataException.java
│ │ └── StudentNotFoundException.java
│ ├── interfaces
│ │ ├── Gradeable.java
│ │ └── Searchable.java
│ ├── service
│ │ └── StudentService.java
│ ├── util
│ │ └── InputUtil.java
│ └── main
│ └── Main.java
├── README.md
└── (other project files)


### Package Highlights
- **entity** – Core domain classes
- **exception** – Custom checked/unchecked exceptions
- **interfaces** – Abstraction using interfaces
- **service** – Business logic (CRUD operations)
- **util** – Helper utilities
- **main** – Application entry point

---

## 6. OOP Concepts Implemented

### ✔ Encapsulation
- Private fields
- Public getters/setters
- Data hiding
- Access modifiers used effectively

### ✔ Inheritance
- `Person → Student → GraduateStudent` (multilevel inheritance)
- Constructor chaining using `super()` and `this()`
- Explanation of diamond problem (Java avoids using single inheritance of classes)

### ✔ Polymorphism
- Method overloading
- Method overriding with `@Override`
- Runtime polymorphism using base-class reference
- Dynamic method dispatch demonstrated

### ✔ Abstraction
- Abstract class usage
- Interface implementation
- Multiple interface implementations
- Default interface methods (Java 8 feature)

---

## 7. Constructors Used
- Default constructor
- Parameterized constructor
- Copy constructor
- Constructor overloading
- Constructor chaining
- Constructor behavior in inheritance hierarchy

---

## 8. Application Features (Student Management System)

### ✔ Core Functionalities
- Add Student
- View All Students
- Update Student Details
- Delete Student
- Search Student by ID or Name
- Manage Course and Enrollment entities
- ArrayList-based dynamic storage
- Clean menu-driven console UI

---
## 📄 Documentation

- [JVM Architecture Report](docs/JVM_Architecture_Report.pdf)
- [Environment Setup Instructions](docs/Environment_Setup_Instructions.pdf)

