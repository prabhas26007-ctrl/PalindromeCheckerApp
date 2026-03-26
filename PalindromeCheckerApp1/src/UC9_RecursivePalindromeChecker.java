// UC9 - Recursive Palindrome Checker
public class UC9_RecursivePalindromeChecker {
    
    public static void main(String[] args) {
        String input = "radar";
        
        boolean isPalindrome = checkPalindrome(input, 0, input.length() - 1);
        
        System.out.println("Input: " + input);
        System.out.println("Is Palindrome? " + isPalindrome);
    }
    
    private static boolean checkPalindrome(String str, int start, int end) {
        // Base case: if pointers meet or cross
        if (start >= end) {
            return true;
        }
        
        // If characters don't match
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        
        // Recursive call with updated pointers
        return checkPalindrome(str, start + 1, end - 1);
    }
}
