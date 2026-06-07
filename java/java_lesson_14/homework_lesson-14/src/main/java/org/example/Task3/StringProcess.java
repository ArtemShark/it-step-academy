package org.example.Task3;

public class StringProcess {
    public static boolean isPalindrome(String str) {
        String cleanStr = str.replaceAll("\\s+", "").toLowerCase();
        return new StringBuilder(cleanStr).reverse().toString().equals(cleanStr);
    }

    public static int countVowels(String str) {
        int count = 0;
        for (char ch : str.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(ch) != -1) {
                count++;
            }
        }
        return count;
    }

    public static int countConsonants(String str) {
        int count = 0;
        for (char ch : str.toLowerCase().toCharArray()) {
            if ("bcdfghjklmnpqrstvwxyz".indexOf(ch) != -1) {
                count++;
            }
        }
        return count;
    }

    public static int countWordOccurrences(String str, String word) {
        String lowercaseStr = str.toLowerCase();
        String lowercaseWord = word.toLowerCase();
        return (lowercaseStr.length() - lowercaseStr.replace(lowercaseWord, "").length()) / lowercaseWord.length();
    }
}

