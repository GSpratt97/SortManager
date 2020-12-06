package com.sparta.greg;

public class BubbleSorter implements Sorter {
    public int[] sortArray(int[] arrayToSort) {
        // Save length of array to a variable
        int arrayLength = arrayToSort.length;

        // For loop sorts through array
        for(int i=0; i < arrayLength - 1; i++) {
            // Inner for loop
            for(int j = 0; j < arrayLength - i -1; j++){
                // Compare this value with next value in array
                // If true (larger) swap integers
                if (arrayToSort[j] > arrayToSort[j+1]) {
                    // Assign temp value to allow swap
                    int temporaryVariable = arrayToSort[j];
                    arrayToSort[j] = arrayToSort[j+1];
                    arrayToSort[j+1] = temporaryVariable;
                }
            }
        }
        return arrayToSort;
    }
}



