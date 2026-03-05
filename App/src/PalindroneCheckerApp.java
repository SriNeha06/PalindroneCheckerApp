import java.util.Scanner;
import java.util.Stack;
import java.util.Deque;
import java.util.LinkedList;

public class UseCase13PalindromeCheckerApp {

    // Stack-based palindrome check
    public static boolean stackPalindrome(String input) {
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            stack.push(c);
        }
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) return false;
        }
        return true;
    }

    // Deque-based palindrome check
    public static boolean dequePalindrome(String input) {
        Deque<Character> deque = new LinkedList<>();
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) return false;
        }
        return true;
    }

    // Two-pointer palindrome check
    public static boolean twoPointerPalindrome(String input) {
        int start = 0, end = input.length() - 1;
        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }

    // Recursive palindrome check
    public static boolean recursivePalindrome(String input, int start, int end) {
        if (start >= end) return true;
        if (input.charAt(start) != input.charAt(end)) return false;
        return recursivePalindrome(input, start + 1, end - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string to check palindrome performance: ");
        String input = scanner.nextLine();

        // Stack approach
        long startTime = System.nanoTime();
        boolean stackResult = stackPalindrome(input);
        long endTime = System.nanoTime();
        long stackTime = endTime - startTime;

        // Deque approach
        startTime = System.nanoTime();
        boolean dequeResult = dequePalindrome(input);
        endTime = System.nanoTime();
        long dequeTime = endTime - startTime;

        // Two-pointer approach
        startTime = System.nanoTime();
        boolean twoPointerResult = twoPointerPalindrome(input);
        endTime = System.nanoTime();
        long twoPointerTime = endTime - startTime;

        // Recursive approach
        startTime = System.nanoTime();
        boolean recursiveResult = recursivePalindrome(input, 0, input.length() - 1);
        endTime = System.nanoTime();
        long recursiveTime = endTime - startTime;

        // Display results
        System.out.println("\nPalindrome Check Results:");
        System.out.printf("Stack Approach: %b (Time: %d ns)%n", stackResult, stackTime);
        System.out.printf("Deque Approach: %b (Time: %d ns)%n", dequeResult, dequeTime);
        System.out.printf("Two-Pointer Approach: %b (Time: %d ns)%n", twoPointerResult, twoPointerTime);
        System.out.printf("Recursive Approach: %b (Time: %d ns)%n", recursiveResult, recursiveTime);

        scanner.close();
    }
}