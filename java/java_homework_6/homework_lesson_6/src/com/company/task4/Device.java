package com.company.task4;

public abstract class Device {
    private String name;

    public Device(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void sound();
    public abstract void show();
    public abstract void desc();
}

