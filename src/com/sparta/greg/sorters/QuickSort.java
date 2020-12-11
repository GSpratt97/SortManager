package com.sparta.greg.sorters;

import com.sparta.greg.sorters.Sorter;

public class QuickSort implements Sorter {
    @Override
    public int[] sortArray(int[] arrayToSort) {
        sort(arrayToSort);
        return arrayToSort;
    }

    private int[] numbers;
    private int number;

    public void sort(int[] array) {
        if (array == null || array.length==0) {
            return;
        }
        this.numbers = array;
        number = array.length;
        quickSort(0, number -1);
    }

    private void quickSort(int low, int high) {
        int i = low, j = high;
        int pivot = numbers[low + (high-low)/2];
        while (i <= j) {
            while (numbers[i] < pivot) {
                i++;
            }
            while (numbers[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchange(i,j);
                i++;
                j--;
            }
        }
        if (low < j) {
            quickSort(low, j);
        }
        if (i < high) {
            quickSort(i, high);
        }
    }

    private void exchange(int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }
}
