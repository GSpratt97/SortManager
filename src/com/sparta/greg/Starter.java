package com.sparta.greg;

import java.util.Arrays;

public class Starter {
    public static void start(){
        int[] arrayToSort = {10,3,5,4,4,4,5,6,5,6,5,2,1,7,8,9,6};
        Printer.printMessage("Inputted array:: "+ Arrays.toString(arrayToSort));
        // Create BubbleSorter object
        BubbleSorter sort = new BubbleSorter();
        Printer.printMessage("Sorted array:: "+ Arrays.toString(sort.sortArray(arrayToSort)));

        //Printer.printMessage("Sorted array:: "+Arrays.toString(Sorter.sortArray(arrayToSort)));

    }
}
