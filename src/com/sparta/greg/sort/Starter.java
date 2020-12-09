package com.sparta.greg.sort;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Starter {
    public static void start(){
        Printer.printMessage("Please choose a sort method by entering a value between 1 and 6: ");
//  - BubbleSort
//  - InsertionSort
//  - MergeSort (iterative or recursive)
//  - QuickSort
//  - SelectionSort
//  - BinaryTreeSort

        // Scanner
        Scanner scanner = new Scanner(System.in);
        int sortMethod = scanner.nextInt();
        Printer.printMessage("Enter array length");
        int lengthOfArray = scanner.nextInt();
        int[] array = new int[lengthOfArray];

        // Randomisation
        Random random = new Random();
        for (int i =0; i< lengthOfArray; i++){
            array[i] += random.nextInt(10)+1;
        }
        Printer.printMessage("Array: "+Arrays.toString(array));
        Printer.printMessage("Sort algorithm to be used: ");

        int[] array1 = {10,3,5,4,4,23,54,57,86,4,5,6,7,8,9,6};
        Printer.printMessage("First array: "+ Arrays.toString(array1));

        // Create BubbleSorter object for array1
        BubbleSorter sort1 = new BubbleSorter();
        //Printer.printMessage("First Array Sorted:: "+ Arrays.toString(sort1.sortArray(array1)));

        int[] array2 = {45,65,2,5,6,34,23,98,78,67,21,7,56,12,25,75,54};
        Printer.printMessage("Second Array: "+ Arrays.toString(array2));

        // Create BubbleSorter object for array2
        BubbleSorter sort2 = new BubbleSorter();
        Printer.printMessage("Second Array Sorted:: "+ Arrays.toString(sort2.sortArray(array2)));

        Printer.printMessage("");

        // Create multi dimension array to move arrays around easier

        Printer.printMessage("Arrays to be merged:: "+ Arrays.toString(array1)+" + "+Arrays.toString(array2));

        int[] mergedArray = MergeArrays.mergeArrays(array1, array2);
        Printer.printMessage("Merged Array:: "+Arrays.toString(mergedArray));

        Printer.printMessage("");

        // Create BubbleSorter object for mergedArrays
        BubbleSorter mergedSorter = new BubbleSorter();
        Printer.printMessage("Merged and Bubble Sorted array:: "+ Arrays.toString(mergedSorter.sortArray(mergedArray)));

        MergeSort mergeSort = new MergeSort();
        Printer.printMessage("Merge sort:: "+ Arrays.toString(mergeSort.sortArray(array1)));
        //Printer.printMessage(""+Arrays.toString());




    }
}
