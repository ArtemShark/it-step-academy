package com.company;

import com.company.task1.Builder;
import com.company.task1.Sailor;
import com.company.task1.Pilot;

public class MainTask1 {
    public static void main(String[] args) {

        Builder builder = new Builder("Артем Гаращенко", 22, 4);
        Sailor sailor = new Sailor("Иван Максименко", 40, "Черный Глаз");
        Pilot pilot = new Pilot("Камилла Чуб", 30, "A158");


        System.out.println("До обновления:");
        builder.introduceSelf();
        System.out.println();
        sailor.introduceSelf();
        System.out.println();
        pilot.introduceSelf();
        System.out.println();

        builder.setYearsOfExperience(7);
        sailor.setShipName("Королева Анна");
        pilot.setAircraftType("Boeing 777");


        System.out.println("\nПосле обновления:");
        System.out.println(builder.getName() + " сейчас имеет " + builder.getYearsOfExperience() + " лет опыта.");
        System.out.println(sailor.getName() + " сейчас работаю на судне, которое называется " + sailor.getShipName() + ".");
        System.out.println(pilot.getName() + " сейчас летаю на самолоте типа " + pilot.getAircraftType() + ".");
    }
}
