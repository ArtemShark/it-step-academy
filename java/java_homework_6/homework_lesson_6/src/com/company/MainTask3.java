package com.company;

import com.company.task3.Money;
import com.company.task3.Product;
public class MainTask3 {
    public static void main(String[] args) {

        Money money = new Money(10, 105);
        System.out.println("Исходная сумма денег:");
        money.printAmount();

        money.setDollars(15);
        money.setCents(75);
        System.out.println("Обновленная сумма денег: $" + money.getDollars() + "." + String.format("%02d", money.getCents()));

        Product product = new Product("Чай", 3, 45);
        System.out.println("\nИсходная информация о продукте:");
        product.printInfo();

        product.setDollars(2);
        product.setCents(99);
        System.out.println("Обновленная информация о продукте: ");
        product.printInfo();

        product.reducePrice(1, 50);
        System.out.println("Информация о продукте после уменьшения цены:");
        product.printInfo();
    }
}

