package com.sparta.greg.sorters;

public class MergeSort implements Sorter {

    @Override
    public int[] sortArray(int[] arrayToSort) {
        int length = arrayToSort.length;
        mergeSort(arrayToSort, length);
        return arrayToSort;
    }

    public static void mergeSort(int[] array, int lengthOfArray) {
        if (lengthOfArray < 2) {return;}
        int midPoint = lengthOfArray / 2;
        int[] leftArray = new int[midPoint];
        int[] rightArray = new int[lengthOfArray - midPoint];

        for (int i = 0; i < midPoint; i++) {
            leftArray[i] = array[i];
        }
        for (int i = midPoint; i < lengthOfArray; i++) {
            rightArray[i - midPoint] = array[i];
        }
        mergeSort(leftArray, midPoint);
        mergeSort(rightArray, lengthOfArray - midPoint);

        merge(array, leftArray, rightArray, midPoint, lengthOfArray - midPoint);
    }

    public static void merge(int[] array, int[] leftArray, int[] rightArray, int left, int right) {
        int leftArrayIndex = 0;
        int j = 0;
        int k = 0;
        while (leftArrayIndex < left && j < right) {
            if (leftArray[leftArrayIndex] <= rightArray[j]) {
                array[k++] = leftArray[leftArrayIndex++];
            } else {
                array[k++] = rightArray[j++];
            }
        }
        while (leftArrayIndex < left) {
            array[k++] = leftArray[leftArrayIndex++];
        }
        while (j < right) {
            array[k++] = rightArray[j++];
        }
    }
}


//    public static int[] mergeArrays(int[] arrayOne, int[] arrayTwo) {
//        // Get length of combined array
//        int sizeOfArray = arrayOne.length + arrayTwo.length;
//
//        // Initialise the first position and create array with size of two other arrays combined
//        int position = 0;
//        int[] mergedArray = new int[sizeOfArray];
//
//        // Loop through both arrays and add each element to the merged array
//        for (int element:arrayOne) {
//            mergedArray[position] = element;
//            position++;
//        }
//        for (int element:arrayTwo) {
//            mergedArray[position] = element;
//            position++;
//        }
//        return mergedArray;
//    }