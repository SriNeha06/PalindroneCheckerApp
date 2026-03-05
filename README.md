# PalindroneCheckerApp
# Palindrome Checker App – Use Case 1

## Project Overview

The **Palindrome Checker App** is a console-based Java application that checks whether a given string is a palindrome under different conditions. The goal of this project is to practice and strengthen core Java programming fundamentals and data structure concepts.

This document describes **Use Case 1**, which focuses on the application startup behavior.

---

## Use Case 1: Application Entry & Welcome Message

### Objective

Display a welcome message and application details when the program starts.

### Actor

User

### Flow of Execution

1. The program starts.
2. The **Java Virtual Machine (JVM)** invokes the `main()` method.
3. The application displays:

    * Application Name
    * Application Version
4. After displaying the information, the program either proceeds to the next use case or exits.

---

## Key Java Concepts Used

### 1. Class

A **Class** acts as a container for the Palindrome Checker application logic.

Example:

```java
public class UseCase1PalindromeCheckerApp {
```

### 2. Main Method

The **main() method** is the entry point of the Java application.

Signature:

```java
public static void main(String[] args)
```

### 3. Static Keyword

The `static` keyword allows the JVM to call the `main()` method **without creating an object** of the class.

### 4. Console Output

The `System.out.println()` method is used to display messages in the console.

Example:

```java
System.out.println("Welcome to Palindrome Checker App");
```

### 5. Application Flow Control

Defines how the application behaves when it starts, before performing palindrome validation.

---

## How to Compile and Run the Program

### Step 1: Compile the Java Program

Open the terminal or command prompt and run:

```bash
javac UseCase1PalindromeCheckerApp.java
```

### Step 2: Run the Program

After successful compilation, run the program using:

```bash
java UseCase1PalindromeCheckerApp
```

---

## Expected Output

When the program runs, the console should display a welcome message and application details similar to:

```
Welcome to Palindrome Checker App
Version: 1.0
This application checks whether a given string is a palindrome.
```

---

## File Structure

```
PalindromeCheckerApp/
│
├── UseCase1PalindromeCheckerApp.java
└── README.md
```

---

## Version

Version: 1.0

---

## Author

Palindrome Checker App – Java Practice Project
# Palindrome Checker App – Use Case 2

## Overview

The **Palindrome Checker App** is a simple console-based Java application that checks whether a given string is a palindrome.
A palindrome is a word that reads the same forwards and backwards.

Example:

* `madam`
* `level`
* `racecar`

This project focuses on strengthening basic **Java programming concepts** such as classes, the main method, strings, and conditional statements.

---

## Use Case 2: Print a Hardcoded Palindrome Result

### Goal

Display whether a **hardcoded string** is a palindrome.

### Actor

User

### Flow

1. Program starts.
2. A hardcoded string is defined in the program.
3. The string is reversed.
4. The program checks whether the original string and reversed string are the same.
5. The result is printed on the console.
6. Program exits.

---

## Key Concepts Used

### Class

In Java, every program must be written inside a class. The class acts as a container for the program logic.

### Main Method

The entry point of the Java program.

```
public static void main(String[] args)
```

### Static Keyword

The `static` keyword allows the Java Virtual Machine (JVM) to call the `main()` method without creating an object of the class.

### String

A built-in Java class used to store and manipulate text.

### String Literal

A sequence of characters enclosed in double quotes.

Example:

```
"madam"
```

### Conditional Statement (if-else)

Used to check whether the string is a palindrome.

### Console Output

`System.out.println()` is used to print the result on the console.

---

## Data Structure Used

**String**

The string data structure is used to store the word that needs to be checked for a palindrome.

---

## Program File

```
UseCase2PalindromeCheckerApp.java
```

---

## How to Compile and Run

### Step 1: Compile the Program

```
javac UseCase2PalindromeCheckerApp.java
```

### Step 2: Run the Program

```
java UseCase2PalindromeCheckerApp
```

---

## Sample Output

```
madam is a Palindrome.
```

---

## Author

Palindrome Checker App – Java Learning Project
