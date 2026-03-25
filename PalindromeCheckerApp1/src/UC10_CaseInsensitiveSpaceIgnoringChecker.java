// UC10 - Case-Insensitive & Space-Ignoring Palindrome Checker
public class UC10_CaseInsensitiveSpaceIgnoringChecker {
    
    public static void main(String[] args) {
        String input = "A man a plan a canal Panama";
        
        // Remove spaces and convert to lowercase
        String processed = input.replaceAll("\\s+", "").toLowerCase();
        
        boolean isPalindrome = checkPalindrome(processed);
        
        System.out.println("Input: " + input);
        System.out.println("Processed: " + processed);
        System.out.println("Is Palindrome? " + isPalindrome);
    }
    
    private static boolean checkPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
