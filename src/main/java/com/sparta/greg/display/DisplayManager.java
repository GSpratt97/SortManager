package com.sparta.greg.display;

import com.sparta.greg.exceptions.SorterLoaderException;
import com.sparta.greg.sorters.Sorter;
import com.sparta.greg.start.Printer;
import com.sparta.greg.start.SorterFactory;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DisplayManager {
    public static void start() throws SorterLoaderException {
        // Welcome message
        Printer.printMessage("Welcome to the sortManager!");
        Printer.printMessage("To start please select a sort algorithm from the selection below: ");
        Printer.printMessage("1: BubbleSort");
        Printer.printMessage("2: InsertionSort");
        Printer.printMessage("3: MergeSort");
        Printer.printMessage("4: QuickSort");
        Printer.printMessage("5: SelectionSort");
        Printer.printMessage("6: BinaryTreeSort");

        Printer.printMessage("");
        Printer.printMessage("Please select an integer between 1 and 6: ");

        // Scanner to select sort algorithm
        Scanner scanner = new Scanner(System.in);
        int sortMethodNumber = scanner.nextInt();
        String sortMethod = null;

        // Switch statement chooses sort method, includes exception case
        switch (sortMethodNumber) {
            case 1:
                sortMethod = "BubbleSort";
                break;
            case 2:
                sortMethod = "InsertionSort";
                break;
            case 3:
                sortMethod = "MergeSort";
                break;
            case 4:
                sortMethod = "QuickSort";
                break;
            case 5:
                sortMethod = "SelectionSort";
                break;
            case 6:
                sortMethod = "BinaryTreeSort";
                break;
            default:
                throw new SorterLoaderException();
        }

        // Initialise sort factory and sorter method
        SorterFactory sorterFactory = new SorterFactory();
        Sorter sorter = sorterFactory.getSorter(sortMethod);

        // Get length to generate a random array and print to screen
        Printer.printMessage("Next, please input an integer to generate an array of random numbers containing values between 1 and 100");
        Printer.printMessage("Enter array length: ");
        int lengthOfArray = scanner.nextInt();
        int[] array = new int[lengthOfArray];
        Random random = new Random();
        for (int i =0; i< lengthOfArray; i++){
            array[i] += random.nextInt(100)+1;
        }

        // Print unsorted array
        Printer.printMessage("Unsorted random array:");
        Printer.printMessage(Arrays.toString(array));
        Printer.printMessage("");
        Printer.printMessage("Sort algorithm: "+sortMethod);

        // Sort results
        Printer.printMessage("Sorted array:");
        Printer.printMessage(Arrays.toString(sorter.sortArray(array)));

        // Time taken for search algorithm
    }
}
