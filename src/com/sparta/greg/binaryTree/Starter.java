package com.sparta.greg.binaryTree;

//import com.sparta.greg.exceptions.ChildNotFoundException;

import java.util.Arrays;

public class Starter {
    public static void start() {
        // Build tree
        BinaryTree binaryTree = new BinaryTree(5);
        binaryTree.addElement(6);
        int[] elementArray = {2,4,7,8,16,7,75,10};
        binaryTree.addElements(elementArray);

        // Root element
        System.out.println("Root element:: "+binaryTree.getRootElement());

        // Number of elements
        System.out.println("Number of elements:: "+binaryTree.getNumberOfElements());

        // Find element
        System.out.println("Element exists:: "+binaryTree.findElement(10));

        // Get left child
        System.out.println("Left child:: "+binaryTree.getLeftChild(3));

        // Get right child
        System.out.println("Right child:: "+binaryTree.getRightChild(5));

        // Get sorted tree Asc
        System.out.println("Sorted Asc:: "+ Arrays.toString(binaryTree.getSortedTreeAsc()));

        // Get sorted tree Desc
        System.out.println("Sorted Desc:: "+ Arrays.toString(binaryTree.getSortedTreeDesc()));

    }
}
