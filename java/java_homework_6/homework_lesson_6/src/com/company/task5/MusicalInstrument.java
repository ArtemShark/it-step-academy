package com.company.task5;

public abstract class MusicalInstrument {
    private String name;

    public MusicalInstrument(String name) {
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
    public abstract void history();
}
