package com.company.task2;

public class Kangaroo extends Animal {
    private double jumpHeight;

    public Kangaroo(String name, String habitat, double jumpHeight) {
        super(name, habitat);
        this.jumpHeight = jumpHeight;
    }

    public double getJumpHeight() {
        return jumpHeight;
    }

    public void setJumpHeight(double jumpHeight) {
        this.jumpHeight = jumpHeight;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("Я могу прыгнуть на высоту " + jumpHeight + " метров.");
    }
}
