package com.company.task5;

public class Trombone extends MusicalInstrument {
    public Trombone(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("Тромбон издает глубокий и мощный звук.");
    }

    @Override
    public void show() {
        System.out.println("Инструмент: " + getName());
    }

    @Override
    public void desc() {
        System.out.println("Тромбон - духовой музыкальный инструмент.");
    }

    @Override
    public void history() {
        System.out.println("Тромбон произошел из средневековых инструментов в 15 веке.");
    }
}

