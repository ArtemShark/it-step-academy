package com.company;

import java.util.Scanner;
import com.company.task4.ArraySaver;
public class MainTask4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter path to the file:");
        String filePath = scanner.nextLine();

        System.out.println("Enter array elements (space-separated):");
        String[] input = scanner.nextLine().split("\\s+");
        int[] array = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            array[i] = Integer.parseInt(input[i]);
        }

        ArraySaver saver = new ArraySaver();
        saver.saveArrayToFile(filePath, array);

        System.out.println("Array has been saved to the file.");
    }
}

