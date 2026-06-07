package com.company.task5;

public class Cello extends MusicalInstrument {
    public Cello(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("Виолончель издает глубокий и насыщенный звук.");
    }

    @Override
    public void show() {
        System.out.println("Инструмент: " + getName());
    }

    @Override
    public void desc() {
        System.out.println("Виолончель - струнный музыкальный инструмент большого размера.");
    }

    @Override
    public void history() {
        System.out.println("Виолончель появился в конце 16 века");
    }
}
