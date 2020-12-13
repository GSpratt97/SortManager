package com.sparta.greg.sorters;

public class InsertionSort implements Sorter{

    @Override
    public int[] sortArray(int[] arrayToSort) {
        sort(arrayToSort);
        return arrayToSort;
    }


    public void sort(int[] arrayToSort) {
        // Get array length
        int lengthOfArray = arrayToSort.length;

        for (int i =1; i < lengthOfArray; ++i) {
            int key = arrayToSort[i];
            int j = i - 1;

            while (j >= 0 && arrayToSort[j] > key) {
                arrayToSort[j + 1] = arrayToSort[j];
                j = j -1;
            }
            arrayToSort[j + 1] = key;
        }
    }
}
