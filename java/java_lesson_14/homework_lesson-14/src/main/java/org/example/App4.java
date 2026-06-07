package org.example;

import org.example.Task4.LengthConverter;
public class App4 {
    public static void main(String[] args) {

        System.out.println("1 метр = " + LengthConverter.convert(1, "m", "mm") + " миллиметров");
        System.out.println("1 метр = " + LengthConverter.convert(1, "m", "cm") + " сантиметров");
        System.out.println("1 метр = " + LengthConverter.convert(1, "m", "dm") + " дециметров");
        System.out.println("1 метр = " + LengthConverter.convert(1, "m", "km") + " километров");

        System.out.println("1 километр = " + LengthConverter.convert(1, "km", "m") + " метров");

        System.out.println("10 сантиметров = " + LengthConverter.convert(10, "cm", "dm") + " дециметров");

        System.out.println("1000000 миллиметров = " + LengthConverter.convert(1000000, "mm", "km") + " километров");
    }
}
