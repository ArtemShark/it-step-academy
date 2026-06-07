package com.company.task3;

public class Product extends Money {
    private String name;

    public Product(String name, int dollars, int cents) {
        super(dollars, cents);
        this.name = name;
    }

    public void reducePrice(int dollarsToReduce, int centsToReduce) {
        int totalCents = (getDollars() - dollarsToReduce) * 100 + (getCents() - centsToReduce);
        if (totalCents < 0) {
            System.out.println("Цена не может быть отрицательной.");
            return;
        }
        setDollars(totalCents / 100);
        setCents(totalCents % 100);
    }

    public void printInfo() {
        System.out.print("Товар: " + name + ", Цена: ");
        printAmount();
    }
}

