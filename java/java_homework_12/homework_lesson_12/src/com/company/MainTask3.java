package com.company;

import java.util.Scanner;
import com.company.task3.ArrayProcess;

public class MainTask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter path to the file:");
        String filePath = scanner.nextLine();

        ArrayProcess process = new ArrayProcess();
        process.processFile(filePath);
    }
}
