import org.junit.Test;
import static org.junit.Assert.*;

public class StringFunctionsTest {

    @Test
    public void testIsPalindrome() {
        assertTrue(StringFunctions.isPalindrome("Radar"));
        assertTrue(StringFunctions.isPalindrome("level"));
        assertFalse(StringFunctions.isPalindrome("hello"));
        assertTrue(StringFunctions.isPalindrome("")); // Empty string is considered a palindrome
        assertTrue(StringFunctions.isPalindrome("a")); // Single character is a palindrome
        assertFalse(StringFunctions.isPalindrome(null)); // Null string is not a palindrome
    }

    @Test
    public void testReverseNumber() {
        assertEquals(4321, StringFunctions.reverseNumber(1234));
        assertEquals(0, StringFunctions.reverseNumber(0)); // Zero remains zero
        assertEquals(1, StringFunctions.reverseNumber(1)); // Single digit remains the same
        assertEquals(987654321, StringFunctions.reverseNumber(123456789));
        assertEquals(123456789, StringFunctions.reverseNumber(987654321)); // Checking with a palindrome number
    }
}
