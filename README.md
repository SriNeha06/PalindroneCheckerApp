# PalindromeCheckerApp – Use Case 11

## Description:
This Java console application checks whether a string is a palindrome using an **object-oriented approach**. All palindrome logic is encapsulated in the `PalindromeChecker` class.

## Key Concepts:
- **Encapsulation**: Internal state (`input`) is private.
- **Single Responsibility Principle**: Class only handles palindrome logic.
- **Stack-based Logic**: Stack is used to reverse characters for comparison.

## Program Flow:
1. User enters a string.
2. `PalindromeChecker` object is created with input string.
3. Call `checkPalindrome()` method:
   - Push characters to stack.
   - Pop and compare with original string.
4. If all characters match → Palindrome.
5. Otherwise → Not a Palindrome.

## Compilation:
```bash
javac UseCase11PalindromeCheckerApp.java