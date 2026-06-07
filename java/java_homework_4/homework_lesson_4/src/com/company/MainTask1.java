package com.company;

import com.company.models.Person;

public class MainTask1 {
    public static void main(String[] args) {

        Person person = new Person("Максименко Иван Петрович", "01.07.2005", "+380984567899",
                "Киев", "Украина", "ул. Рибалки 12А");

        System.out.println(person.toString());

        person.setFullName("Гаращенко Никита Русланович");
        person.setBirthDate("22.05.2006");
        person.setPhoneNumber("+380673214567");
        person.setCity("Львов");
        person.setCountry("Украина");
        person.setHomeAddress("ул. Коперника 11");


        System.out.println();

        System.out.println("Обновленная информация о человеке:");
        System.out.println("ФИО: " + person.getFullName());
        System.out.println("Дата рождения: " + person.getBirthDate());
        System.out.println("Телефон: " + person.getPhoneNumber());
        System.out.println("Город: " + person.getCity());
        System.out.println("Страна: " + person.getCountry());
        System.out.println("Домашний адрес: " + person.getHomeAddress());
    }
}
