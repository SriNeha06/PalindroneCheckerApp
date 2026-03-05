# PalindromeCheckerApp – Use Case 12

## Description:
This Java console application demonstrates **Strategy Pattern** for palindrome checking. Users can dynamically choose which algorithm to use (Stack or Deque).

## Key Concepts:
- **Interface**: `PalindromeStrategy` defines a common method for all strategies.
- **Polymorphism**: Concrete strategies implement the interface differently.
- **Strategy Pattern**: Context class (`PalindromeCheckerContext`) can work with any strategy dynamically.
- **Data Structure**: Stack or Deque, depending on strategy.

## Program Flow:
1. User enters a string.
2. User selects a palindrome algorithm (Stack or Deque).
3. `PalindromeCheckerContext` sets the chosen strategy.
4. Context calls `checkPalindrome()` of the strategy.
5. Prints result.

## Compilation:
```bash
javac UseCase12PalindromeCheckerApp.java