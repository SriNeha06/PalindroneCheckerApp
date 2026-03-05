# PalindromeCheckerApp – Use Case 7

## Description:
This console-based Java application checks whether a given string is a palindrome using a **Deque (Double Ended Queue)** for optimized front and rear comparisons.

## Key Concepts:
- **Deque (Double Ended Queue)**: Allows insertion and removal from both front and rear.
- **Front and Rear Access**: Directly compare first and last characters.
- **Optimized Handling**: No need for separate reversal structures like stack or queue.

## Program Flow:
1. User enters a string.
2. Characters are inserted into a Deque.
3. First and last characters are removed and compared.
4. Repeat until deque is empty or has one element.
5. If all pairs match → Palindrome.
6. Otherwise → Not a Palindrome.

## Compilation:
```bash
javac UseCase7PalindromeCheckerApp.java