import java.util.Scanner;

public class UseCase8PalindromeCheckerApp {

    // Node class for singly linked list
    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    // Convert string to linked list
    public static Node stringToLinkedList(String input) {
        if (input.isEmpty()) return null;

        Node head = new Node(input.charAt(0));
        Node current = head;

        for (int i = 1; i < input.length(); i++) {
            current.next = new Node(input.charAt(i));
            current = current.next;
        }

        return head;
    }

    // Reverse a linked list
    public static Node reverseList(Node head) {
        Node prev = null;
        Node current = head;
        Node next;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    // Check palindrome
    public static boolean isPalindrome(Node head) {
        if (head == null || head.next == null) return true;

        // Find middle using fast and slow pointers
        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        Node secondHalf = reverseList(slow.next);

        // Compare first and second half
        Node firstHalf = head;
        Node tempSecond = secondHalf;
        boolean isPalin = true;

        while (tempSecond != null) {
            if (firstHalf.data != tempSecond.data) {
                isPalin = false;
                break;
            }
            firstHalf = firstHalf.next;
            tempSecond = tempSecond.next;
        }

        // Restore original list (optional)
        slow.next = reverseList(secondHalf);

        return isPalin;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter a string to check palindrome: ");
        String input = scanner.nextLine();

        // Convert to linked list
        Node head = stringToLinkedList(input);

        // Check palindrome
        if (isPalindrome(head)) {
            System.out.println("The given string is a Palindrome.");
        } else {
            System.out.println("The given string is NOT a Palindrome.");
        }

        scanner.close();
    }
}