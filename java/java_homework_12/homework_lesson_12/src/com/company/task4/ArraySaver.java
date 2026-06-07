package com.company.task4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class ArraySaver {

    public void saveArrayToFile(String filePath, int[] array) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {

            writer.write(arrayToString(array));
            writer.newLine();


            int[] even = Arrays.stream(array).filter(n -> n % 2 == 0).toArray();
            writer.write(arrayToString(even));
            writer.newLine();


            int[] odd = Arrays.stream(array).filter(n -> n % 2 != 0).toArray();
            writer.write(arrayToString(odd));
            writer.newLine();


            int[] reversed = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                reversed[i] = array[array.length - 1 - i];
            }
            writer.write(arrayToString(reversed));
            writer.newLine();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String arrayToString(int[] array) {
        return Arrays.stream(array)
                .mapToObj(String::valueOf)
                .reduce((s1, s2) -> s1 + " " + s2)
                .orElse("");
    }
}

