package com.company.task3;

import java.util.ArrayList;
import java.util.List;

public class ArrayProcess {
    private List<ArrayStats> arraysStats = new ArrayList<>();
    private int globalMin = Integer.MAX_VALUE;
    private int globalMax = Integer.MIN_VALUE;
    private int globalSum = 0;

    public void processFile(String filePath) {
        MyFileReader fileReader = new MyFileReader();
        List<String> lines = fileReader.readLines(filePath);

        for (String line : lines) {
            ArrayStats stats = new ArrayStats(line);
            arraysStats.add(stats);
            stats.printStats();

            globalMin = Math.min(globalMin, stats.getMin());
            globalMax = Math.max(globalMax, stats.getMax());
            globalSum += stats.getSum();
        }

        printGlobalStats();
    }

    private void printGlobalStats() {
        System.out.println("\nGlobal Min: " + globalMin);
        System.out.println("Global Max: " + globalMax);
        System.out.println("Global Sum: " + globalSum);
    }
}
