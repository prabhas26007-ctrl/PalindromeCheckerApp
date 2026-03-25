// UC12 - Strategy Pattern for Palindrome Checker
interface PalindromeStrategy {
    boolean check(String str);
}

class TwoPointerStrategy implements PalindromeStrategy {
    public boolean check(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left++) != str.charAt(right--)) return false;
        }
        return true;
    }
}

class ReverseStrategy implements PalindromeStrategy {
    public boolean check(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}

class Context {
    private PalindromeStrategy strategy;
    
    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }
    
    public boolean execute(String str) {
        return strategy.check(str);
    }
}

public class UC12_StrategyPatternPalindromeChecker {
    public static void main(String[] args) {
        Context context = new Context();
        context.setStrategy(new TwoPointerStrategy());
        System.out.println("Two Pointer: " + context.execute("racecar"));
        context.setStrategy(new ReverseStrategy());
        System.out.println("Reverse: " + context.execute("racecar"));
    }
}
