import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Scanner;

public class UseCase6PalindromeCheckerApp {

    public static boolean isPalindrome(String input) {
        // Initialize Queue (FIFO) and Stack (LIFO)
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Enqueue to queue and push to stack
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            queue.add(ch);  // enqueue
            stack.push(ch); // push
        }

        // Compare dequeue vs pop
        while (!queue.isEmpty()) {
            char fromQueue = queue.remove(); // dequeue
            char fromStack = stack.pop();    // pop

            if (fromQueue != fromStack) {
                return false; // Not a palindrome
            }
        }

        return true; // Palindrome
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a string to check palindrome: ");
        String input = scanner.nextLine();

        // Check using Queue + Stack
        if (isPalindrome(input)) {
            System.out.println("The given string is a Palindrome.");
        } else {
            System.out.println("The given string is NOT a Palindrome.");
        }

        scanner.close();
    }
}