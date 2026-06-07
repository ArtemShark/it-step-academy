package com.company;

import java.util.Scanner;
import com.company.task1.FileComparator;

public class MainTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter path to the first file:");
        String filePath1 = scanner.nextLine();
        System.out.println("Enter path to the second file:");
        String filePath2 = scanner.nextLine();

        FileComparator comparator = new FileComparator();
        comparator.compareFiles(filePath1, filePath2);
    }
}
