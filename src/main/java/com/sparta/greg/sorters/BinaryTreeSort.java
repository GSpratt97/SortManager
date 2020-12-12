package com.sparta.greg.sorters;

import com.sparta.greg.binaryTree.BinaryTree;
import com.sparta.greg.start.Printer;

public class BinaryTreeSort implements Sorter {
    @Override
    public int[] sortArray(int[] unsortedArray) {
        Printer.printMessage("Please note binary search algorithm removes duplicates!");
        return binaryTreeSort(unsortedArray);
    }

    public int[] binaryTreeSort(int[] array) {
        BinaryTree binaryTree = new BinaryTree(array[0]);
        binaryTree.addElements(array);
        return binaryTree.getSortedTreeAsc();
    }

}
