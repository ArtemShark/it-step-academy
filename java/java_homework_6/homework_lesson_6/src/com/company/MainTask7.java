package com.company;

import java.util.Random;
import com.company.task7.Array;

public class MainTask7 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }

        Array array = new Array(numbers);

        System.out.println("Исходный массив:");
        array.printElements();

        array.sortAsc();
        System.out.println("Массив после сортировки по возрастанию:");
        array.printElements();

        array.sortDesc();
        System.out.println("Массив после сортировки по убыванию:");
        array.printElements();
    }
}
