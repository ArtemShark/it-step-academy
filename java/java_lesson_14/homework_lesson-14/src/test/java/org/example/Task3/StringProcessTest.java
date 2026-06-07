package org.example.Task3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringProcessTest {

    @Test
    void testIsPalindrome() {
        assertTrue(StringProcess.isPalindrome("madam"));
        assertTrue(StringProcess.isPalindrome("racecar"));
        assertFalse(StringProcess.isPalindrome("java"));
    }

    @Test
    void testCountVowels() {
        assertEquals(2, StringProcess.countVowels("hello"));
        assertEquals(5, StringProcess.countVowels("aeiou"));
    }

    @Test
    void testCountConsonants() {
        assertEquals(3, StringProcess.countConsonants("hello"));
        assertEquals(0, StringProcess.countConsonants("aeiou"));
    }

    @Test
    void testCountWordOccurrences() {
        assertEquals(2, StringProcess.countWordOccurrences("hello world, hello everyone", "hello"));
        assertEquals(1, StringProcess.countWordOccurrences("the quick brown fox", "fox"));
        assertEquals(0, StringProcess.countWordOccurrences("the quick brown fox", "dog"));
    }
}
