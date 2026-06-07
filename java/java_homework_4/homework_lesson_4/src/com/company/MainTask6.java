package com.company;

import com.company.models.Car;
public class MainTask6 {
    public static void main(String[] args) {

        Car car1 = new Car("RS 6 Avant", "Audi", 2023, 6.0);
        System.out.println("Initial car1 info: " + car1);

        // Создание объекта автомобиля с использованием перегруженного конструктора
        Car car2 = new Car("Mustang", "Ford", 2004);
        System.out.println("Initial car2 info: " + car2);


        car2.setEngineVolume(5.0);

        System.out.println();
        System.out.println("Updated car2 info:");
        System.out.println("Name: " + car2.getName());
        System.out.println("Manufacturer: " + car2.getManufacturer());
        System.out.println("Year of Manufacture: " + car2.getYearOfManufacture());
        System.out.println("Engine Volume: " + car2.getEngineVolume() + "L");
    }
}

