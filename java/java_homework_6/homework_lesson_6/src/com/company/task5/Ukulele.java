package com.company.task5;

public class Ukulele extends MusicalInstrument {
    public Ukulele(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("Укулеле издает веселый и яркий звук.");
    }

    @Override
    public void show() {
        System.out.println("Инструмент: " + getName());
    }

    @Override
    public void desc() {
        System.out.println("Укулеле - струнный музыкальный инструмент, похожий на небольшую гитару.");
    }

    @Override
    public void history() {
        System.out.println("Укулеле возникло в 19 веке на Гавайях.");
    }
}
