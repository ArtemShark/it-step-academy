package com.company;

import com.company.task6.Array;
import java.util.Random;
public class MainTask6 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }

        Array array = new Array(numbers);

        System.out.println("Сгенерированный массив:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        System.out.println("Максимум среди элементов массива: " + array.max());
        System.out.println("Минимум среди элементов массива: " + array.min());
        System.out.println("Среднеарифметическое среди элементов массива: " + array.avg());
    }
}

