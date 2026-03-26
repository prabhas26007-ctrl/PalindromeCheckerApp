import java.util.LinkedList;

// UC8 - Linked List Based Palindrome Checker
public class UC8_LinkedListBasedPalindromeChecker {
    
    // Node class for custom linked list
    static class Node {
        char data;
        Node next;
        
        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }
    
    public static void main(String[] args) {
        String input = "level";
        
        // Create linked list from input string
        Node head = null;
        Node tail = null;
        
        for (char c : input.toCharArray()) {
            Node newNode = new Node(c);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        
        // Check palindrome using two pointers
        boolean isPalindrome = checkPalindrome(head, input.length());
        
        System.out.println("Input: " + input);
        System.out.println("Is Palindrome? " + isPalindrome);
    }
    
    private static boolean checkPalindrome(Node head, int length) {
        // Find middle of linked list
        Node slow = head;
        Node fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // Reverse second half
        Node secondHalf = reverse(slow);
        Node firstHalf = head;
        
        // Compare both halves
        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data) {
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        return true;
    }
    
    private static Node reverse(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;
        
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}
