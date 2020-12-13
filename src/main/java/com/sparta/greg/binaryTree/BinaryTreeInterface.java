package com.sparta.greg.binaryTree;

import com.sparta.greg.exceptions.ChildNotFoundException;

public interface BinaryTreeInterface {

    int getRootElement();

    int getNumberOfElements();

    void addElements(final int[] elements);

    void addElement(final int element);

    boolean findElement(final int value);

    int getLeftChild(int element) throws ChildNotFoundException;

    int getRightChild(int element) throws ChildNotFoundException;

    int[] getSortedTreeAsc();

    int[] getSortedTreeDesc();

}
