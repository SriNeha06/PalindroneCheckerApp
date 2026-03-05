# PalindromeCheckerApp – Use Case 6

## Description:
This console-based Java application checks whether a given string is a palindrome using both **Queue** and **Stack** to demonstrate FIFO vs LIFO behavior.

## Key Concepts:
- **Queue (FIFO)**: First In First Out data structure.
- **Stack (LIFO)**: Last In First Out data structure.
- **Enqueue & Dequeue**: Insert/remove elements from queue.
- **Push & Pop**: Insert/remove elements from stack.
- **Logical Comparison**: Dequeue (queue) vs Pop (stack) to validate palindrome.

## Program Flow:
1. User enters a string.
2. Each character is enqueued to a Queue and pushed to a Stack.
3. Characters are dequeued from the Queue and popped from the Stack.
4. If all corresponding characters match → Palindrome.
5. Otherwise → Not a Palindrome.

## Compilation:
```bash
javac UseCase6PalindromeCheckerApp.java