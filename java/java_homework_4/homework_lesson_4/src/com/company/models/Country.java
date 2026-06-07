package com.company.models;

import java.util.ArrayList;
import java.util.List;

public class Country {
    private String countryName;
    private String continent;
    private int population;
    private String phoneCode;
    private String capital;
    private List<String> cities;

    public Country(String countryName, String continent, int population, String phoneCode, String capital) {
        this.countryName = countryName;
        this.continent = continent;
        this.population = population;
        this.phoneCode = phoneCode;
        this.capital = capital;
        this.cities = new ArrayList<>();
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setPhoneCode(String phoneCode) {
        this.phoneCode = phoneCode;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void addCity(String city) {
        this.cities.add(city);
    }


    public String getCountryName() {
        return countryName;
    }

    public String getContinent() {
        return continent;
    }

    public int getPopulation() {
        return population;
    }

    public String getPhoneCode() {
        return phoneCode;
    }

    public String getCapital() {
        return capital;
    }

    public List<String> getCities() {
        return cities;
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryName='" + countryName + '\'' +
                ", continent='" + continent + '\'' +
                ", population=" + population +
                ", phoneCode='" + phoneCode + '\'' +
                ", capital='" + capital + '\'' +
                ", cities=" + cities +
                '}';
    }
}

