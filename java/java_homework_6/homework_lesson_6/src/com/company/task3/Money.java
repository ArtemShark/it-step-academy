package com.company.task3;

public class Money {
    private int dollars;
    private int cents;

    public Money(int dollars, int cents) {
        this.dollars = dollars;
        this.cents = cents;
        normalize();
    }

    private void normalize() {
        if (cents >= 100) {
            dollars += cents / 100;
            cents = cents % 100;
        }
    }

    public void printAmount() {
        System.out.println("$" + dollars + "." + String.format("%02d", cents));
    }

    public int getDollars() {
        return dollars;
    }

    public void setDollars(int dollars) {
        this.dollars = dollars;
    }

    public int getCents() {
        return cents;
    }

    public void setCents(int cents) {
        this.cents = cents;
        normalize();
    }
}
