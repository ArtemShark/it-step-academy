package com.company.task1;

public class Builder extends Human {
    private int yearsOfExperience;

    public Builder(String name, int age, int yearsOfExperience) {
        super(name, age);
        this.yearsOfExperience = yearsOfExperience;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public void introduceSelf() {
        super.introduceSelf();
        System.out.println("Я строитель с " + yearsOfExperience + " годами опыта");
    }
}
