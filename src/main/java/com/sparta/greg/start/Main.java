package com.sparta.greg.start;

import com.sparta.greg.display.DisplayManager;
import com.sparta.greg.exceptions.ArrayLengthOutOfBounds;
import com.sparta.greg.exceptions.SorterLoaderException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static Logger Logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) throws SorterLoaderException, ArrayLengthOutOfBounds {
        Logger.info("The program has been initialised!");
        DisplayManager.start();
//        Logger.debug("This is a debug message");
//        Logger.info("This is an info message");
//        Logger.warn("This is a warning message");
//        Logger.error("This is an error message");
//        Logger.fatal("This is a fatal message");

//        Requirements:
//        1. Client is presented with a number of sort algorithms to choose from
//        2. Decision is given via the command line (Scanner)
//        3. The program will then ask for the length of an array again via the command line (Scanner)
//        4. The program should then output:
//        - The unsorted randomly generated array
//        - The sort algorithm to be used
//        - The sorted array after the algorithm has been executed
//        - The time taken
//
//        You are required to test both the functionality of the program and the peformance of the algorithms (speed tests)
//        You should include but are not limited to:
//        - BubbleSort
//        - InsertionSort
//        - MergeSort (iterative or recursive)
//        - QuickSort
//        - SelectionSort
//        - BinaryTreeSort
//
//        Additions:
//        - GUI
//        - Logging
//        - Generic Sorts (Consider interaction with a suitable interface)
//        - Good code structure in accordance with design patterns (refactoring)
//
//        Submission:
//        - Code should be hosted on your own Github page with a suitable README.md file
//        - A link to your completed project should be emailed to Manish by 23:59 on 13/12/2020

    }
}
