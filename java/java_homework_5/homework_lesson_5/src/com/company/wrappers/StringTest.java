package com.company.wrappers;

import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {

        String literalString = "Пример литерала";
        String newString = new String("Строка через new");
        char[] charArray = {'м', 'а', 'с', 'с', 'и', 'в', ' ', 'с', 'и', 'м', 'в', 'о', 'л', 'о', 'в'};
        String fromCharArray = new String(charArray);
        byte[] byteArray = {104, 101, 108, 108, 111};
        String fromByteArray = new String(byteArray);
        StringBuilder stringBuilder = new StringBuilder("Строка из StringBuilder");


        String fruits = "Апельсин,Яблоко,Гранат,Груша";
        String[] fruitArray = fruits.split(",");
        String longestFruit = "";
        for (String fruit : fruitArray) {
            if (fruit.length() > longestFruit.length()) {
                longestFruit = fruit;
            }
        }
        System.out.println(longestFruit.toLowerCase());

        for (String fruit : fruitArray) {
            System.out.println(fruit.substring(0, Math.min(3, fruit.length())));
        }

        String newStringLiteral = "   Я_новая_строка      ";
        newStringLiteral = newStringLiteral.trim().replace('_', ' ');
        System.out.println(newStringLiteral);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        String inputText = scanner.nextLine();
        System.out.println("Вы ввели: " + inputText);

        if (inputText.startsWith("Запуск")) {
            System.out.println("Запускаем процесс");
        }
        if (inputText.endsWith("завершен")) {
            System.out.println("Процесс завершен");
        }
        if (inputText.toLowerCase().contains("ошибка")) {
            System.out.println("Произошла ошибка");
        }


        StringBuilder allStrings = new StringBuilder();
        allStrings.append(literalString).append('\n')
                .append(newString).append('\n')
                .append(fromCharArray).append('\n')
                .append(fromByteArray).append('\n')
                .append(stringBuilder).append('\n')
                .append(fruits).append('\n')
                .append(newStringLiteral).append('\n')
                .append(inputText).append('\n');

        allStrings.reverse();

        System.out.println(allStrings.toString());
    }
}

