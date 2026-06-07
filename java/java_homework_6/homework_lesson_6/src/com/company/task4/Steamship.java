package com.company.task4;

public class Steamship extends Device {
    public Steamship(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("Пароход сигналит");
    }

    @Override
    public void show() {
        System.out.println("Название устройства: " + getName());
    }

    @Override
    public void desc() {
        System.out.println("Это водное транспортное средство");
    }
}

