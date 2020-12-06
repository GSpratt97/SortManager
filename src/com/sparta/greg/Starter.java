package com.sparta.greg;

import java.util.Arrays;

public class Starter {
    public static void start(){
        int[] array1 = {10,3,5,4,4,23,54,57,86,4,5,6,7,8,9,6};
        Printer.printMessage("First array:: "+ Arrays.toString(array1));
        // Create BubbleSorter object for array1
        BubbleSorter sort1 = new BubbleSorter();
        Printer.printMessage("First Array Sorted:: "+ Arrays.toString(sort1.sortArray(array1)));

        Printer.printMessage("");

        int[] array2 = {45,65,2,5,6,34,23,98,78,67,21,7,56,12,25,75,54};
        Printer.printMessage("Second Array:: "+ Arrays.toString(array2));

        // Create BubbleSorter object for array2
        BubbleSorter sort2 = new BubbleSorter();
        Printer.printMessage("Second Array Sorted:: "+ Arrays.toString(sort2.sortArray(array2)));

        Printer.printMessage("");

        // Create multi dimension array to move arrays around easier
        int[][] twoArrays = {array1, array2};
        int[] firstArray = twoArrays[0];
        int[] secondArray = twoArrays[1];
        Printer.printMessage("Arrays to be merged:: "+ Arrays.toString(firstArray)+" + "+Arrays.toString(secondArray));

        int[] mergedArray = MergeArrays.mergeArrays(twoArrays);
        Printer.printMessage("Merged Array:: "+Arrays.toString(mergedArray));

        Printer.printMessage("");

        // Create BubbleSorter object for mergedArrays
        BubbleSorter mergedSorter = new BubbleSorter();
        Printer.printMessage("Merged and Sorted array:: "+ Arrays.toString(mergedSorter.sortArray(mergedArray)));
    }
}
