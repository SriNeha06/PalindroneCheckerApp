# PalindromeCheckerApp – Use Case 9

## Description:
This console-based Java application checks whether a given string is a palindrome using **recursion**, demonstrating base condition handling and recursive calls.

## Key Concepts:
- **Recursion**: A method calls itself to check smaller substrings.
- **Base Condition**: Stops recursion when middle of string is reached.
- **Call Stack**: Implicitly used to store recursive calls.

## Program Flow:
1. User enters a string.
2. Recursive method compares characters at start and end.
3. If all characters match → Palindrome.
4. If any mismatch → Not a Palindrome.
5. Recursion stops when `start >= end`.

## Compilation:
```bash
javac UseCase9PalindromeCheckerApp.java