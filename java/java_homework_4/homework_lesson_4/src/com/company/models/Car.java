package com.company.models;

public class Car {
    private String name;
    private String manufacturer;
    private int yearOfManufacture;
    private double engineVolume;


    public Car(String name, String manufacturer, int yearOfManufacture, double engineVolume) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.yearOfManufacture = yearOfManufacture;
        this.engineVolume = engineVolume;
    }

    // Перегруженный конструктор
    public Car(String name, String manufacturer, int yearOfManufacture) {
        this(name, manufacturer, yearOfManufacture, 0.0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                ", engineVolume=" + engineVolume +
                '}';
    }
}
