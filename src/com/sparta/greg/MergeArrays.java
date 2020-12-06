package com.sparta.greg;

public class MergeArrays {
    public static int[] mergeArrays(int[][] twoArrays) {
        // Extract first array and get length
        int[] firstArray = twoArrays[0];
        int firstArrayLength = firstArray.length;
        // Extract second array and get length
        int[] secondArray = twoArrays[1];
        int secondArrayLength = secondArray.length;

        // Initialise the first position and create array with size of two other arrays combined
        int position = 0;
        int[] mergedArray = new int[firstArrayLength+secondArrayLength];

        // Loop through both arrays and add each element to the merged array
        for (int element:firstArray) {
            mergedArray[position] = element;
            position++;
        }
        for (int element:secondArray) {
            mergedArray[position] = element;
            position++;
        }
    return mergedArray;
    }
}
