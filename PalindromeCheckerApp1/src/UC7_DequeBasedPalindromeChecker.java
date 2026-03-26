import java.util.ArrayDeque;
import java.util.Deque;

// UC7 - Deque-Based Optimized Palindrome Checker
public class UC7_DequeBasedPalindromeChecker {
    public static void main(String[] args) {
        // Test string
        String input = "racecar";
        
        // Create a Deque to store characters
        Deque<Character> deque = new ArrayDeque<>();
        
        // Insert all characters into the deque
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }
        
        // Check palindrome by comparing front and rear elements
        boolean isPalindrome = true;
        while (deque.size() > 1) {
            char first = deque.removeFirst();  // Remove from front
            char last = deque.removeLast();    // Remove from rear
            
            if (first != last) {
                isPalindrome = false;
                break;
            }
        }
        
        // Display result
        System.out.println("Input: " + input);
        System.out.println("Is Palindrome? " + isPalindrome);
    }
}
