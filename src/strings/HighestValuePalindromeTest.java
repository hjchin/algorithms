package strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class HighestValuePalindromeTest {

    @Test
    public void test(){
        assertEquals("3993",HighestValuePalindrome.run("3943", 4, 1));
        assertEquals("992299",HighestValuePalindrome.run("092282", 6, 3));
        assertEquals("-1",HighestValuePalindrome.run("0011", 4, 1));
        assertEquals("11011",HighestValuePalindrome.run("10011", 5, 1));
        assertEquals("91019",HighestValuePalindrome.run("10011", 5, 3));
        assertEquals("9199919",HighestValuePalindrome.run("1111911", 7, 4));
        assertEquals("999",HighestValuePalindrome.run("329", 3, 2));
        assertEquals("992299",HighestValuePalindrome.run("932239", 6, 2));
        assertEquals("91199119",HighestValuePalindrome.run("11119111", 8, 4));
        assertEquals("91177119",HighestValuePalindrome.run("11117111", 8, 3));
        assertEquals("9991999",HighestValuePalindrome.run("9711319", 7, 4));
        assertEquals("9911199",HighestValuePalindrome.run("1111111", 7, 4));
        assertEquals("929394959493929",HighestValuePalindrome.run("128392759430124", 15, 8));

    }

    @Test
    public void testPalindrome(){
        assertTrue(HighestValuePalindrome.isPalindrome(""));
        assertTrue(HighestValuePalindrome.isPalindrome("1"));
        assertTrue(HighestValuePalindrome.isPalindrome("11"));
        assertFalse(HighestValuePalindrome.isPalindrome("12"));
        assertTrue(HighestValuePalindrome.isPalindrome("121"));
        assertTrue(HighestValuePalindrome.isPalindrome("1111"));
        assertTrue(HighestValuePalindrome.isPalindrome("1221"));
        assertTrue(HighestValuePalindrome.isPalindrome("12221"));
        assertTrue(HighestValuePalindrome.isPalindrome("12421"));
        assertFalse(HighestValuePalindrome.isPalindrome("12441"));
    }
}