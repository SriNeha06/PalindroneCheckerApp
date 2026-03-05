# PalindromeCheckerApp – Use Case 10

## Description:
This Java console application checks whether a string is a palindrome **ignoring spaces, punctuation, and capitalization**.

## Key Concepts:
- **String Preprocessing**: Normalize input by removing non-alphanumeric characters and converting to lowercase.
- **Two-Pointer Technique**: Efficiently check palindrome by comparing start and end characters.
- **Regular Expressions**: Used for removing unwanted characters.

## Program Flow:
1. User enters a string.
2. Input is normalized:
    - Remove non-alphanumeric characters.
    - Convert to lowercase.
3. Two-pointer technique checks palindrome.
4. If all characters match → Palindrome.
5. Otherwise → Not a Palindrome.

## Compilation:
```bash
javac UseCase10PalindromeCheckerApp.java