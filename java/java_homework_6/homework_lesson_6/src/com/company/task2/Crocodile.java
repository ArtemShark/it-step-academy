package com.company.task2;

public class Crocodile extends Animal {
    private double length;

    public Crocodile(String name, String habitat, double length) {
        super(name, habitat);
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("Я имею длину " + length + " метров.");
    }
}

