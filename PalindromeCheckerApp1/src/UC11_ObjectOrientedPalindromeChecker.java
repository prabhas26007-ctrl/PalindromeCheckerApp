// UC11 - Object-Oriented Palindrome Checker
class PalindromeChecker {
    private String input;
    
    public PalindromeChecker(String input) {
        this.input = input;
    }
    
    public boolean check() {
        int left = 0;
        int right = input.length() - 1;
        
        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

public class UC11_ObjectOrientedPalindromeChecker {
    public static void main(String[] args) {
        PalindromeChecker checker = new PalindromeChecker("madam");
        System.out.println("Is Palindrome? " + checker.check());
    }
}
