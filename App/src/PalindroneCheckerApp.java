import java.util.Scanner;

public class UseCase10PalindromeCheckerApp {

    // Normalize string: remove non-alphanumeric and convert to lowercase
    public static String normalizeString(String str) {
        return str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    }

    // Check palindrome using two-pointer approach
    public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter a string to check palindrome: ");
        String input = scanner.nextLine();

        // Normalize input
        String normalized = normalizeString(input);

        // Check palindrome
        if (isPalindrome(normalized)) {
            System.out.println("The given string is a Palindrome (case & space ignored).");
        } else {
            System.out.println("The given string is NOT a Palindrome (case & space ignored).");
        }

        scanner.close();
    }
}