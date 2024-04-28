public class Main {
    public static void main(String[] args) {
        // Example usage of the refactored isPalindrome method
        String testString = "Radar";
        boolean isPalindromeResult = StringFunctions.isPalindrome(testString);
        System.out.println(testString + " is a palindrome: " + isPalindromeResult);

        // Example usage of the refactored reverseNumber method
        int testNumber = 1234;
        int reversedNumber = StringFunctions.reverseNumber(testNumber);
        System.out.println("Original Number: " + testNumber);
        System.out.println("Reversed Number: " + reversedNumber);
    }
}
