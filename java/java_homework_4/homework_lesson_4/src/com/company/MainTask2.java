package com.company;

import com.company.models.City;

public class MainTask2 {
    public static void main(String[] args) {

        City city = new City("Киев", "Киевская область", "Украина", 1500000, "03150", "+380");

        System.out.println(city.toString());

        city.setCityName("Варшава");
        city.setRegionName("Мазовецкое");
        city.setCountryName("Польша");
        city.setPopulation(1200000);
        city.setPostalCode("02-134");
        city.setPhoneCode("+48");


        System.out.println();
        System.out.println("Обновленная информация о городе:");
        System.out.println("Название города: " + city.getCityName());
        System.out.println("Название региона: " + city.getRegionName());
        System.out.println("Название страны: " + city.getCountryName());
        System.out.println("Количество жителей: " + city.getPopulation());
        System.out.println("Почтовый индекс: " + city.getPostalCode());
        System.out.println("Телефонный код: " + city.getPhoneCode());
    }
}

