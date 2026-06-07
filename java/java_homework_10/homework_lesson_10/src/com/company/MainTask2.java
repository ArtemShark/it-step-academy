package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MainTask2 {
    public static void main(String[] args) {

        List<String> products = Arrays.asList(
                "Молоко", "Хлеб", "Яблоко", "Масло", "Сок", "Сыр", "Мясо", "Молоко", "Сыр", "Йогурт");

        System.out.println("Все продукты:");
        products.forEach(System.out::println);

        System.out.println("\nПродукты с названием меньше пяти символов:");
        products.stream()
                .filter(product -> product.length() < 5)
                .forEach(System.out::println);


        Scanner scanner = new Scanner(System.in);
        System.out.print("\nВведите название продукта для подсчета: ");
        String userInput = scanner.nextLine();
        long count = products.stream()
                .filter(product -> product.equalsIgnoreCase(userInput))
                .count();
        System.out.println("Продукт \"" + userInput + "\" встречается " + count + " раз(а)");


        System.out.print("\nВведите букву для отображения продуктов, начинающихся на неё: ");
        String startingLetter = scanner.nextLine().toUpperCase();
        List<String> productsStartingWithLetter = products.stream()
                .filter(product -> product.toUpperCase().startsWith(startingLetter))
                .collect(Collectors.toList());
        if (productsStartingWithLetter.isEmpty()) {
            System.out.println("Продуктов, начинающихся на букву \"" + startingLetter + "\" нет.");
        } else {
            System.out.println("Продукты, начинающиеся на букву \"" + startingLetter + "\":");
            productsStartingWithLetter.forEach(System.out::println);
        }


        System.out.println("\nПродукты из категории \"Молоко\":");
        products.stream()
                .filter(product -> product.equalsIgnoreCase("молоко"))
                .forEach(System.out::println);
    }
}

