package com.company;

import java.util.Scanner;
import com.company.task2.LongestLineFinder;
public class MainTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter path to the file:");
        String filePath = scanner.nextLine();

        LongestLineFinder finder = new LongestLineFinder();
        finder.findLongestLine(filePath);
    }
}

