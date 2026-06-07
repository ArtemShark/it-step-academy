package org.example;

import org.example.Task2.CurrencyConverter;
public class App2 {
    public static void main(String[] args) {
        CurrencyConverter converter = new CurrencyConverter();

        double euros = 100;
        double eurosToUsd = converter.convert(euros, "EUR", "USD");
        System.out.println(euros + " EUR равны " + eurosToUsd + " USD");

        double pounds = 100;
        double poundsToJpy = converter.convert(pounds, "GBP", "JPY");
        System.out.println(pounds + " GBP равны " + poundsToJpy + " JPY");

        double dollars = 100;
        double usdToEur = converter.convert(dollars, "USD", "EUR");
        System.out.println(dollars + " USD равны " + usdToEur + " EUR");

        double yen = 10000;
        double jpyToGbp = converter.convert(yen, "JPY", "GBP");
        System.out.println(yen + " JPY равны " + jpyToGbp + " GBP");
    }
}

