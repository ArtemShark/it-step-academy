package com.company.task4;

public class Car extends Device {
    public Car(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("Автомобиль гудит");
    }

    @Override
    public void show() {
        System.out.println("Название устройства: " + getName());
    }

    @Override
    public void desc() {
        System.out.println("Это транспортное средство");
    }
}
