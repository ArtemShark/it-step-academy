package com.company;

import com.company.models.Country;
public class MainTask3 {
    public static void main(String[] args) {
        Country country = new Country("Украина", "Евразия", 38000000, "+380", "Киев");
        country.addCity("Киев");
        country.addCity("Львов");
        country.addCity("Ужгород");

        System.out.println(country.toString());

        country.setCountryName("Франция");
        country.setContinent("Европа");
        country.setPopulation(67390000);
        country.setPhoneCode("+33");
        country.setCapital("Париж");
        country.addCity("Париж");
        country.addCity("Марсель");
        country.addCity("Лион");

        System.out.println();
        System.out.println("Обновленная информация о стране:");
        System.out.println("Название страны: " + country.getCountryName());
        System.out.println("Континент: " + country.getContinent());
        System.out.println("Население: " + country.getPopulation());
        System.out.println("Телефонный код: " + country.getPhoneCode());
        System.out.println("Столица: " + country.getCapital());
        System.out.println("Города: " + country.getCities());
    }
}

