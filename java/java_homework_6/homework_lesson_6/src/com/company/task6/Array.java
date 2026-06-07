package com.company.task6;

public class Array implements IMath {
    private int[] elements;

    public Array(int[] elements) {
        this.elements = elements;
    }

    @Override
    public int max() {
        int max = elements[0];
        for (int element : elements) {
            if (element > max) {
                max = element;
            }
        }
        return max;
    }

    @Override
    public int min() {
        int min = elements[0];
        for (int element : elements) {
            if (element < min) {
                min = element;
            }
        }
        return min;
    }

    @Override
    public float avg() {
        float sum = 0;
        for (int element : elements) {
            sum += element;
        }
        return sum / elements.length;
    }
}

