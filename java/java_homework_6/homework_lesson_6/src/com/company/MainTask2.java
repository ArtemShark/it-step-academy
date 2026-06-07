package com.company;

import com.company.task2.Crocodile;
import com.company.task2.Tiger;
import com.company.task2.Kangaroo;
public class MainTask2 {
    public static void main(String[] args) {
        Tiger tiger = new Tiger("Тигр Ричард", "Джунгли", 120);
        Crocodile crocodile = new Crocodile("Крокодил Гена", "Река", 4.5);
        Kangaroo kangaroo = new Kangaroo("Кенгуру Джек", "Пустыня", 3);

        tiger.introduce();
        System.out.println();
        crocodile.introduce();
        System.out.println();
        kangaroo.introduce();

        tiger.setStripesCount(125);
        crocodile.setLength(5);
        kangaroo.setJumpHeight(3.5);

        System.out.println("\nПосле обновления:");
        System.out.println(tiger.getName() + " теперь имеет " + tiger.getStripesCount() + " полос.");
        System.out.println(crocodile.getName() + " теперь имеет длину " + crocodile.getLength() + " метров.");
        System.out.println(kangaroo.getName() + " теперь может прыгать на высоту " + kangaroo.getJumpHeight() + " метров.");
    }
}
