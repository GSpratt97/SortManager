package com.sparta.greg.sorters;

public class BubbleSort implements Sorter {
    @Override
    public int[] sortArray(int[] arrayToSort) {
        return bubbleSort(arrayToSort);
    }

    public int[] bubbleSort(int[] array) {
        // Get array length
        int arrayLength = array.length;

        // Loop through entire array
        for(int i=0; i < arrayLength - 1; i++) {
            // Loop to compare values
            for(int j = 0; j < arrayLength - i -1; j++){
                // Compare values, if true (larger) swap integers
                if (array[j] > array[j+1]) {
                    // Swap values
                    int temporaryVariable = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temporaryVariable;
                }
            }
        }
        return array;
    }
}



