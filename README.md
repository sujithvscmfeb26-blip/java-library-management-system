# Java Library Management System -  Book Inventory

A **console-based Library Management System** built using **Java** that demonstrates Object-Oriented Programming principles and Java core concepts.

This project allows users to manage books in a library through a **menu-driven console interface**.

---

## Features

- Add a new book
- View all books
- Search book by ID
- Update book details
- Delete a book
- Sort books by:
  - Title
  - Author
  - Price
  - Rating
  - Publication Year
- Exception handling for invalid operations
- Prevention of duplicate Book IDs

---

## Technologies Used

- Java
- OOP (Object-Oriented Programming)
- ArrayList Collection
- Packages
- Functional Interfaces
- Lambda Expressions
- Custom Exceptions
- Comparator for Sorting
- Menu Driven Console Application

---

## Project Structure

```
com.library
│
├── main
│   └── Program.java
│
├── models
│   └── Book.java
│
└── managers
    ├── BookManager.java
    └── LibraryOperations.java
```

---

## Concepts Demonstrated

This project demonstrates the following Java concepts:

- Encapsulation
- Abstraction
- Collections (ArrayList)
- Functional Interfaces
- Lambda Expressions
- Comparator
- Custom Exception Handling
- Package Structure
- Menu-driven application design

---

## Example Menu

```
1. Add Book
2. View All Books
3. Search Book by ID
4. Update Book
5. Delete Book
6. Sort Books by Title
7. Sort Books by Price
8. Sort Books by Rating
9. Sort Books by Publication Year
10. Exit
```

---

## How to Run

1. Clone the repository

```
git clone https://github.com/your-username/java-library-management-system.git
```

2. Compile the program

```
javac com/library/main/Program.java
```

3. Run the program

```
java com.library.main.Program
```

---

## Author

Sujith V

---

## Future Improvements

- File based data storage
- Database integration
- GUI version using JavaFX or Swing
