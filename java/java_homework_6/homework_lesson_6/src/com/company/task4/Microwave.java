package com.company.task4;

public class Microwave extends Device {
    public Microwave(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("Микроволновка пищит");
    }

    @Override
    public void show() {
        System.out.println("Название устройства: " + getName());
    }

    @Override
    public void desc() {
        System.out.println("Это устройство для разогрева пищи");
    }
}
