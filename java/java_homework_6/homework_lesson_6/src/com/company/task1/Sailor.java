package com.company.task1;

public class Sailor extends Human {
    private String shipName;

    public Sailor(String name, int age, String shipName) {
        super(name, age);
        this.shipName = shipName;
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    @Override
    public void introduceSelf() {
        super.introduceSelf();
        System.out.println("Я работаю на судне, которое называется " + shipName + ".");
    }
}

