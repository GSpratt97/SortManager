package com.sparta.greg.sorters;

import com.sparta.greg.binaryTree.BinaryTree;
import com.sparta.greg.binaryTree.Node;

import java.util.Arrays;

public class BinaryTreeSort implements Sorter{
    @Override
    public int[] sortArray(int[] unsortedArray) {
        return binaryTreeSort(unsortedArray);
    }

    public int[] binaryTreeSort(int[] array) {
        BinaryTree binaryTree = new BinaryTree(array[0]);
        int[] elementArray = array;
        binaryTree.addElements(array);
        return binaryTree.getSortedTreeAsc();
    }

}
