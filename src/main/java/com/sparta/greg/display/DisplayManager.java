package com.sparta.greg.display;

import com.sparta.greg.exceptions.ArrayLengthOutOfBounds;
import com.sparta.greg.exceptions.SorterLoaderException;
import com.sparta.greg.sorters.Sorter;
import com.sparta.greg.start.Main;
import com.sparta.greg.start.Printer;
import com.sparta.greg.start.RandomArrayGenerator;
import com.sparta.greg.start.SorterFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DisplayManager {
    private static org.apache.logging.log4j.Logger Logger = LogManager.getLogger(DisplayManager.class);
    public static void start() throws SorterLoaderException, ArrayLengthOutOfBounds {
        // Welcome message
        Printer.printMessage("Welcome to the sortManager!");
        Printer.printMessage("To start please select a sort algorithm from the selection below: ");
        Printer.printMessage("");

        Printer.printMessage("1: BubbleSort");
        Printer.printMessage("2: InsertionSort");
        Printer.printMessage("3: MergeSort");
        Printer.printMessage("4: QuickSort");
        Printer.printMessage("5: SelectionSort");
        Printer.printMessage("6: BinaryTreeSort");

        Printer.printMessage("");
        Printer.printMessage("Please select an integer between 1 and 6 corresponding to the desired sort algorithm: ");

        // Scanner to select sort algorithm
        Scanner scanner = new Scanner(System.in);
        int sortMethodNumber = scanner.nextInt();
        String sortMethod;

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
                Logger.error("Sort method was not selected! Value entered: " +sortMethodNumber);
                throw new SorterLoaderException();
        }
        Logger.info("User has input value '" +sortMethodNumber+"' which is the '" + sortMethod + "' method");

        // Initialise sort factory and sorter method
        SorterFactory sorterFactory = new SorterFactory();
        Sorter sorter = sorterFactory.getSorter(sortMethod);

        // Get length to generate a random array and print to screen
        Printer.printMessage("Next, please input an integer to generate an array of random numbers containing values between 1 and 100.");
        Printer.printMessage("(WARNING input values of 99_999 and higher may take a long time to compute and values above 99_999_999 are not allowed!)");
        Printer.printMessage("Enter array length: ");
        int lengthOfArray = scanner.nextInt();
        Logger.info("User has inputted array length: "+lengthOfArray);
        int[] array = RandomArrayGenerator.generateArray(lengthOfArray);

        // Print unsorted array
        Printer.printMessage("Unsorted random array:");
        Printer.printMessage(Arrays.toString(array));
        Logger.info("Random array generated and printed to console");
        Printer.printMessage("");
        Printer.printMessage("Sort algorithm: "+sortMethod);

        // Sort results and time
        Printer.printMessage("Sorted array:");
        long startSortTime = System.nanoTime();
        int[] sortedArray = sorter.sortArray(array);
        long finishSortTime = System.nanoTime();
        Logger.info("Array sorted using method: " + sortMethod);

        // Print sorted array to console
        Printer.printMessage(Arrays.toString(sortedArray));
        Logger.info("Sorted array printed to console");

        // Time taken for search algorithm
        long timeToSort = (finishSortTime - startSortTime) /1_000_000;
        Printer.printMessage("Time taken to sort array: "+ timeToSort + " ms");
        Logger.info("Time taken to sort array: "+timeToSort+ " ms");
    }
}
