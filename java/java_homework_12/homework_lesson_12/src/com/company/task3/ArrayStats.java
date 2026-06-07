package com.company.task3;

import java.util.Arrays;

public class ArrayStats {
    private int[] array;
    private int min;
    private int max;
    private int sum;

    public ArrayStats(String line) {
        this.array = parseLine(line);
        calculateStats();
    }

    private int[] parseLine(String line) {
        return Arrays.stream(line.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    private void calculateStats() {
        min = Arrays.stream(array).min().orElse(0);
        max = Arrays.stream(array).max().orElse(0);
        sum = Arrays.stream(array).sum();
    }

    public void printStats() {
        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Min: " + min + ", Max: " + max + ", Sum: " + sum);
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public int getSum() {
        return sum;
    }
}
