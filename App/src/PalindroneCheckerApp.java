import java.util.Scanner;
import java.util.Stack;

// PalindromeChecker class encapsulates all palindrome logic
class PalindromeChecker {

    private String input;

    // Constructor
    public PalindromeChecker(String input) {
        this.input = input;
    }

    // Method to check palindrome using Stack
    public boolean checkPalindrome() {
        if (input == null || input.isEmpty()) {
            return true; // Empty string is considered palindrome
        }

        Stack<Character> stack = new Stack<>();

        // Push all characters to stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // Compare popped characters with original string
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

// Main application class
public class UseCase11PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter a string to check palindrome: ");
        String userInput = scanner.nextLine();

        // Create PalindromeChecker object
        PalindromeChecker checker = new PalindromeChecker(userInput);

        // Check palindrome
        if (checker.checkPalindrome()) {
            System.out.println("The given string is a Palindrome.");
        } else {
            System.out.println("The given string is NOT a Palindrome.");
        }

        scanner.close();
    }
}