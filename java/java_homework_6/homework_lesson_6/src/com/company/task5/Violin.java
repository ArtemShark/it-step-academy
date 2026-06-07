package com.company.task5;

public class Violin extends MusicalInstrument {
    public Violin(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("Скрипка издает мелодичный звук.");
    }

    @Override
    public void show() {
        System.out.println("Инструмент: " + getName());
    }

    @Override
    public void desc() {
        System.out.println("Скрипка - струнный музыкальный инструмент.");
    }

    @Override
    public void history() {
        System.out.println("История скрипки начинается в начале 16 века в Италии.");
    }
}

