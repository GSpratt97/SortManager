package com.sparta.greg.sorters;

import com.sparta.greg.sorters.Sorter;

public class BubbleSort implements Sorter {
    @Override
    public int[] sortArray(int[] arrayToSort) {
        return bubbleSort(arrayToSort);
    }

    public int[] bubbleSort(int[] array) {
        // Save length of array to a variable
        int arrayLength = array.length;

        // For loop sorts through array
        for(int i=0; i < arrayLength - 1; i++) {
            // Inner for loop
            for(int j = 0; j < arrayLength - i -1; j++){
                // Compare this value with next value in array
                // If true (larger) swap integers
                if (array[j] > array[j+1]) {
                    // Assign temp value to allow swap
                    int temporaryVariable = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temporaryVariable;
                }
            }
        }
        return array;
    }
}


