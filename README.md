# Palindrome Checker App – Use Case 3

## Overview

The **Palindrome Checker App** is a console-based Java application that checks whether a given string is a palindrome.

A **palindrome** is a word that reads the same forwards and backwards.

Examples:

* madam
* level
* racecar

This use case demonstrates checking a palindrome by **reversing the string using a loop** and comparing it with the original string.

---

## Use Case 3: Palindrome Check Using String Reverse

### Goal

Check whether a string is a palindrome by reversing it.

### Flow

1. Program starts.
2. A string is defined in the program.
3. The string is reversed using a **for loop**.
4. The reversed string is compared with the original string.
5. The result is displayed on the console.

---

## Key Concepts Used

### 1. Loop (for loop)

A **for loop** is used to iterate through the characters of the string in reverse order.

Example:
for (int i = original.length() - 1; i >= 0; i--)

---

### 2. String Immutability

In Java, **String objects are immutable**.
Once created, their values cannot be changed. Any modification creates a **new String object**.

---

### 3. String Concatenation (+)

The `+` operator is used to build the reversed string character by character.

Example:
reversed = reversed + original.charAt(i);

---

### 4. equals() Method

The `equals()` method compares the **actual content of two strings**.

Example:
original.equals(reversed)

This is preferred over `==` because `==` compares memory references instead of string content.

---

## Data Structure Used

**String**

Strings are used to store and manipulate textual data in the application.

---

## Program File

UseCase3PalindromeCheckerApp.java

---

## How to Compile and Run

### Compile the Program

javac UseCase3PalindromeCheckerApp.java

### Run the Program

java UseCase3PalindromeCheckerApp

---

## Sample Output

madam is a Palindrome.

---

## Author

Java Palindrome Checker Learning Project
