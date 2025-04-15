# Final-Coursework-Project
# 🎓 Student Management System

## 📌 Project Description

This is a simple Java console application for managing student records. It was developed as a coursework project to demonstrate basic programming skills in Java.

The program allows you to:
- Add new students
- View all students
- Delete students by ID
- Generate a simple report with statistics

Data is saved in a text file (`students.txt`) for persistence between sessions.

---

## 🧠 Technologies & Concepts Used

- ✅ Java (basic syntax, classes, methods)
- ✅ File I/O (read/write from `.txt` file)
- ✅ ArrayList for storing student data
- ✅ Scanner for user input
- ✅ Modular code structure with 3 classes
- ✅ Input validation (e.g., checking numbers)
- ✅ Basic error handling (file not found, wrong input)

---

## 🧱 Project Structure

| File               | Description                                 |
|--------------------|---------------------------------------------|
| `Main.java`        | Main menu and user interface                |
| `Student.java`     | Represents a student object (data model)    |
| `StudentService.java` | Contains all logic (add, delete, report) |
| `students.txt`     | File where student records are stored       |

---

## 🧾 Functions Implemented

### 🔹 `add(Student s)`
Adds a new student to the file.

### 🔹 `getAll()`
Reads and returns all students from the file.

### 🔹 `deleteById(String id)`
Removes a student by their unique ID.

### 🔹 `generateReport()`
Generates summary report:
- Total students
- Average math, science, English grades
- Average attendance

### 🔹 `fromCSV(String line)`
Converts a line from the file into a `Student` object.

### 🔹 `toCSV()`
Converts a `Student` object into a line for the file.

---

## 🚀 How to Run the Project

1. Open the terminal/command line inside your project folder.
2. Compile the code:
   ```bash
   javac *.java
