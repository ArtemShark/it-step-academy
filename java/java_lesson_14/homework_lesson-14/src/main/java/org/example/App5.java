package org.example;

import org.example.Task5.WeightConverter;
public class App5 {
    public static void main(String[] args) {
        System.out.println("1 килограмм = " + WeightConverter.convert(1, "kg", "mg") + " миллиграмм");
        System.out.println("1 килограмм = " + WeightConverter.convert(1, "kg", "g") + " грамм");
        System.out.println("1 тонна = " + WeightConverter.convert(1, "ton", "kg") + " килограммов");
        System.out.println("1 тонна = " + WeightConverter.convert(1, "ton", "centner") + " центнеров");
        System.out.println("100 центнеров = " + WeightConverter.convert(100, "centner", "ton") + " тонн");
        System.out.println("1000 грамм = " + WeightConverter.convert(1000, "g", "kg") + " килограмм");
        System.out.println("1000000 миллиграмм = " + WeightConverter.convert(1000000, "mg", "kg") + " килограмм");
        System.out.println("1 центнер = " + WeightConverter.convert(1, "centner", "kg") + " килограммов");
    }
}

