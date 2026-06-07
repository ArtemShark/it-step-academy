package org.example;

import org.example.Task3.StringProcess;
public class App3 {
    public static void main(String[] args) {
        StringProcess stringProcessor = new StringProcess();

        String palindromeTestString = "Madam";
        System.out.println(palindromeTestString + " is palindrome: " + StringProcess.isPalindrome(palindromeTestString));

        String vowelsTestString = "hello";
        System.out.println("Number of vowels in \"" + vowelsTestString + "\": " + StringProcess.countVowels(vowelsTestString));

        String consonantsTestString = "hello";
        System.out.println("Number of consonants in \"" + consonantsTestString + "\": " + StringProcess.countConsonants(consonantsTestString));

        String wordOccurrencesTestString = "hello world, hello everyone";
        String wordToFind = "hello";
        System.out.println("Number of occurrences of \"" + wordToFind + "\" in \"" + wordOccurrencesTestString + "\": " + StringProcess.countWordOccurrences(wordOccurrencesTestString, wordToFind));
    }
}

