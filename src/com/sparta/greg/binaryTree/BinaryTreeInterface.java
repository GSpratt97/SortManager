package com.sparta.greg.binaryTree;

//import com.sparta.greg.exceptions.ChildNotFoundException;

public interface BinaryTreeInterface {

    int getRootElement(); // Ok

    int getNumberOfElements(); // Ok

    void addElements(final int[] elements); // Ok

    void addElement(final int element); // Ok

    boolean findElement(final int value); // Ok

    int getLeftChild(int element); // throws ChildNotFoundException;

    int getRightChild(int element); // throws ChildNotFoundException;

    int[] getSortedTreeAsc(); // Ok

    int[] getSortedTreeDesc(); // Ok

}
