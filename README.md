# 🎓 Student Record Tracker


## 📌 Project Description

This is a simple Java console application for managing student records. It was developed as a coursework project to demonstrate basic programming skills in Java.

The program allows you to:
- Add new students
- View all students
- Delete students by ID
- Generate a simple report with statistics

Data is saved in a text file (`students.csv`) for persistence between sessions.

## 🧠 Technologies & Concepts Used

- ✅ Java (basic syntax, classes, methods)
- ✅ File I/O (read/write from `.csv` file)
- ✅ ArrayList for storing student data
- ✅ Scanner for user input
- ✅ Modular code structure with 3 classes
- ✅ Input validation (e.g., checking numbers)
- ✅ Basic error handling (file not found, wrong input)

## 🧱 Project Structure

| File               | Description                                 |
|--------------------|---------------------------------------------|
| `Main.java`        | Main menu and user interface                |
| `Student.java`     | Represents a student object (data model)    |
| `StudentService.java` | Contains all logic (add, delete, report) |
| `students.csv`     | File where student records are stored       |

## 🧾 Functions Implemented

🔹 `add(Student s)`  
Adds a new student to the file.

🔹 `getAll()`  
Reads and returns all students from the file.

🔹 `deleteById(String id)`  
Removes a student by their unique ID.

🔹 `generateReport()`  
Generates summary report:
- Total students
- Average math, science, English grades
- Average attendance

🔹 `fromCSV(String line)`  
Converts a line from the file into a `Student` object.

🔹 `toCSV()`  
Converts a `Student` object into a line for the file.

## 🚀 How to Run the Project

1. Open the terminal/command line inside your project folder.
2. Compile the code:
   javac *.java
3. Run the program:
   java Main

## 📊 Example Input/Output

When you run the program, the following menu is displayed:

1 - Add Student  
2 - Show All  
3 - Delete by ID  
4 - Report  
0 - Exit

▶ Example: Adding a student

Enter student ID: S001  
First Name: John  
Last Name: Doe  
Gender: M  
Grade Level: Grade 10  
Math Grade: 88  
Science Grade: 92  
English Grade: 85  
Attendance (%): 95  
✅ Student added successfully!

▶ Example: Showing all students

Student ID: S001  
Name: John Doe  
Gender: M  
Grade Level: Grade 10  
Math: 88, Science: 92, English: 85  
Attendance: 95%  
-------------------------

▶ Example: Deleting a student

Enter ID to delete: S001  
✅ Student deleted.

▶ Example: Report

=== 📋 Report ===  
Total students: 3  
Average Math Grade: 82  
Average Science Grade: 85  
Average English Grade: 87  
Average Attendance: 92%

## 📌 Notes

- All data is stored in `students.csv`.
- The file must not contain headers (like "StudentID,...").
- The program handles invalid input (e.g., letters instead of numbers).
- No GUI is used – only console.

## ✍️ Author

Coursework project by **Anarbaeva Asel**.  
Simple, clean, and focused on core programming concepts.



