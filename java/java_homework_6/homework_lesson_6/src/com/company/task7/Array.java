package com.company.task7;

import java.util.Arrays;
public class Array implements ISort {
    private int[] elements;

    public Array(int[] elements) {
        this.elements = elements;
    }

    @Override
    public void sortAsc() {
        Arrays.sort(elements);
    }

    @Override
    public void sortDesc() {
        Arrays.sort(elements);
        for (int i = 0; i < elements.length / 2; i++) {
            int temp = elements[i];
            elements[i] = elements[elements.length - i - 1];
            elements[elements.length - i - 1] = temp;
        }
    }

    public void printElements() {
        for (int element : elements) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
