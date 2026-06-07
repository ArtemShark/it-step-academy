package com.company.task1;

public class Pilot extends Human {
    private String aircraftType;

    public Pilot(String name, int age, String aircraftType) {
        super(name, age);
        this.aircraftType = aircraftType;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    @Override
    public void introduceSelf() {
        super.introduceSelf();
        System.out.println("Я летаю на самолете типа " + aircraftType + ".");
    }
}

