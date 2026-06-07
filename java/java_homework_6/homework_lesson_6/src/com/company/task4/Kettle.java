package com.company.task4;

public class Kettle extends Device {
    public Kettle(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("Чайник шипит");
    }

    @Override
    public void show() {
        System.out.println("Название устройства: " + getName());
    }

    @Override
    public void desc() {
        System.out.println("Это устройство для кипячения воды");
    }
}

