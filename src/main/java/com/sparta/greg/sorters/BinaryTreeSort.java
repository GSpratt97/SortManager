package com.sparta.greg.sorters;

import com.sparta.greg.binaryTree.BinaryTree;
import com.sparta.greg.start.Main;
import com.sparta.greg.start.Printer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BinaryTreeSort implements Sorter {
    private static Logger Logger = LogManager.getLogger(BinaryTreeSort.class);

    @Override
    public int[] sortArray(int[] unsortedArray) {
        Printer.printMessage("Please note binary search algorithm removes duplicates!");
        Logger.warn("Please note binary search algorithm removes duplicates!");
        return binaryTreeSort(unsortedArray);
    }

    // Call binary tree sort method
    public int[] binaryTreeSort(int[] array) {
        // Pass rootNode value, build tree and return sorted array
        BinaryTree binaryTree = new BinaryTree(array[0]);
        binaryTree.addElements(array);
        return binaryTree.getSortedTreeAsc();
    }

}
