# PalindromeCheckerApp – Use Case 8

## Description:
This Java console application checks whether a given string is a palindrome using a **singly linked list**, demonstrating in-place reversal and fast/slow pointer technique.

## Key Concepts:
- **Singly Linked List**: Dynamic data structure with sequential access via `next`.
- **Node Traversal**: Sequentially access each character.
- **Fast & Slow Pointer**: Efficiently find the middle node.
- **In-Place Reversal**: Reverse second half of the list without extra memory.

## Program Flow:
1. Convert the input string to a singly linked list.
2. Use fast and slow pointers to locate the middle of the list.
3. Reverse the second half of the list.
4. Compare first and second halves node by node.
5. If all characters match → Palindrome.
6. Otherwise → Not a Palindrome.
7. Optional: Restore original linked list structure.

## Compilation:
```bash
javac UseCase8PalindromeCheckerApp.java