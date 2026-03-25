// UC13 - Performance Comparison of Palindrome Checking Methods
public class UC13_PerformanceComparison {
    
    public static void main(String[] args) {
        String testString = "racecar";
        int iterations = 1000000;
        
        // Method 1: Two Pointer
        long start1 = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            twoPointerCheck(testString);
        }
        long end1 = System.nanoTime();
        
        // Method 2: String Reverse
        long start2 = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            reverseCheck(testString);
        }
        long end2 = System.nanoTime();
        
        // Method 3: Recursive
        long start3 = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            recursiveCheck(testString, 0, testString.length() - 1);
        }
        long end3 = System.nanoTime();
        
        System.out.println("Performance Comparison for \"" + testString + "\" (" + iterations + " iterations):");
        System.out.println("Two Pointer: " + (end1 - start1) / 1000000 + " ms");
        System.out.println("String Reverse: " + (end2 - start2) / 1000000 + " ms");
        System.out.println("Recursive: " + (end3 - start3) / 1000000 + " ms");
    }
    
    private static boolean twoPointerCheck(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left++) != str.charAt(right--)) return false;
        }
        return true;
    }
    
    private static boolean reverseCheck(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }
    
    private static boolean recursiveCheck(String str, int left, int right) {
        if (left >= right) return true;
        if (str.charAt(left) != str.charAt(right)) return false;
        return recursiveCheck(str, left + 1, right - 1);
    }
}
