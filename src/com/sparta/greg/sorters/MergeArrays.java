package com.sparta.greg.sorters;

public class MergeArrays {


    public static int[] mergeArrays(int[] arrayOne, int[] arrayTwo) {
        // Get length of combined array
        int sizeOfArray = arrayOne.length + arrayTwo.length;

        // Initialise the first position and create array with size of two other arrays combined
        int position = 0;
        int[] mergedArray = new int[sizeOfArray];

        // Loop through both arrays and add each element to the merged array
        for (int element:arrayOne) {
            mergedArray[position] = element;
            position++;
        }
        for (int element:arrayTwo) {
            mergedArray[position] = element;
            position++;
        }
    return mergedArray;
    }
}
