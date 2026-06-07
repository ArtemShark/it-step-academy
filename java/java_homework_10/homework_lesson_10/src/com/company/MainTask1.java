package com.company;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class MainTask1 {
    public static void main(String[] args) {
        List<Integer> numbers = generateRandomNumbers(20, -100, 100);

        System.out.println("Сгенерированный набор чисел:");
        System.out.println(numbers);

        long positiveCount = numbers.stream()
                .filter(num -> num > 0)
                .count();

        long negativeCount = numbers.stream()
                .filter(num -> num < 0)
                .count();

        long twoDigitCount = numbers.stream()
                .filter(num -> num >= 10 && num <= 99)
                .count();

        long palindromeCount = numbers.stream()
                .filter(MainTask1::isPalindrome)
                .count();

        System.out.println();
        System.out.println("Количество положительных чисел: " + positiveCount);
        System.out.println("Количество отрицательных чисел: " + negativeCount);
        System.out.println("Количество двухзначных чисел: " + twoDigitCount);
        System.out.println("Количество зеркальных чисел: " + palindromeCount);
    }

    private static boolean isPalindrome(int num) {
        String strNum = String.valueOf(num);
        return strNum.equals(new StringBuilder(strNum).reverse().toString());
    }

    private static List<Integer> generateRandomNumbers(int count, int min, int max) {
        Random random = new Random();
        return random.ints(count, min, max + 1)
                .boxed()
                .collect(Collectors.toList());
    }
}
