package com.company;

import com.company.task4.Device;
import com.company.task4.Car;
import com.company.task4.Kettle;
import com.company.task4.Microwave;
import com.company.task4.Steamship;

public class MainTask4 {
    public static void main(String[] args) {
        Device kettle = new Kettle("Чайник Bosch");
        Device microwave = new Microwave("Микроволновка Samsung");
        Device car = new Car("Автомобиль Tesla");
        Device steamship = new Steamship("Пароход Titanic");

        Device[] devices = {kettle, microwave, car, steamship};

        for (Device device : devices) {
            device.show();
            device.sound();
            device.desc();
            System.out.println();
        }

        System.out.println("После изменения названий устройств:");
        kettle.setName("Чайник Philips");
        microwave.setName("Микроволновка LG");
        car.setName("Автомобиль BMW");
        steamship.setName("Пароход Queen Mary");


        for (Device device : devices) {
            System.out.println("Обновленное название устройства: " + device.getName());
        }
    }
}


