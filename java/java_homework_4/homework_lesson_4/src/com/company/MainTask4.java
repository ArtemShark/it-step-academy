package com.company;

import com.company.models.Fraction;

public class MainTask4 {
    public static void main(String[] args) {

        Fraction fraction1 = new Fraction(1, 2);
        Fraction fraction2 = new Fraction(3, 4);


        System.out.println("Первая дробь: " + fraction1);
        System.out.println("Вторая дробь: " + fraction2);


        fraction1.setNumerator(2);
        fraction1.setDenominator(3);
        fraction2.setNumerator(4);
        fraction2.setDenominator(5);

        System.out.println();
        System.out.println("Измененная первая дробь: " + fraction1.getNumerator() + "/" + fraction1.getDenominator());
        System.out.println("Измененная вторая дробь: " + fraction2.getNumerator() + "/" + fraction2.getDenominator());

        System.out.println();
        System.out.println("Сложение дробей: " + fraction1.add(fraction2));
        System.out.println("Вычитание дробей: " + fraction1.subtract(fraction2));
        System.out.println("Умножение дробей: " + fraction1.multiply(fraction2));
        System.out.println("Деление дробей: " + fraction1.divide(fraction2));
    }
}

