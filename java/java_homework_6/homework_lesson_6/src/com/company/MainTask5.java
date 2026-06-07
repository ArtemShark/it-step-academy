package com.company;

import com.company.task5.MusicalInstrument;
import com.company.task5.Violin;
import com.company.task5.Trombone;
import com.company.task5.Cello;
import com.company.task5.Ukulele;
public class MainTask5 {
    public static void main(String[] args) {

        MusicalInstrument violin = new Violin("Скрипка");
        MusicalInstrument trombone = new Trombone("Тромбон");
        MusicalInstrument ukulele = new Ukulele("Укулеле");
        MusicalInstrument cello = new Cello("Виолончель");

        MusicalInstrument[] instruments = {violin, trombone, ukulele, cello};

        for (MusicalInstrument instrument : instruments) {
            instrument.show();
            instrument.sound();
            instrument.desc();
            instrument.history();
            System.out.println();
        }


        System.out.println("Тестирование:");
        for (MusicalInstrument instrument : instruments) {
            String originalName = instrument.getName();
            instrument.setName(originalName + " Deluxe Edition");
            System.out.println("Обновленное название инструмента: " + instrument.getName());
            System.out.println();
        }
    }
}
