package com.sparta.greg.binaryTree;

import com.sparta.greg.exceptions.ChildNotFoundException;

public class BinaryTree implements BinaryTreeInterface {
    private final Node rootNode;
    public int count;
    int[] sortedTree;

    public BinaryTree(final int element) {
        rootNode = new Node(element);
    }

    private void addNodeToTree(Node node, int element) {
        if (element == node.getValue()) return;

        if (element < node.getValue()) {
            if (node.isLeftChildEmpty()) {
                node.setLeftChild(new Node(element));
            } else {
                addNodeToTree(node.getLeftChild(), element);
            }
        } else if (element > node.getValue()) {
            if (node.isRightChildEmpty()) {
                node.setRightChild(new Node(element));
            } else {
                addNodeToTree(node.getRightChild(), element);
            }
        }
    }

    public int getRootElement() {
        return rootNode.getValue();
    }

    private int getNumberOfElementsRecursive(Node node) {
        int count = 1;
        if (!node.isLeftChildEmpty()) {
            count += getNumberOfElementsRecursive(node.getLeftChild());
        }
        if (!node.isRightChildEmpty()) {
            count += getNumberOfElementsRecursive(node.getRightChild());
        }
        return count;
    }

    public int getNumberOfElements() {
        int count = 0;
        if (rootNode.getValue() != 0 ) {
            count += getNumberOfElementsRecursive(rootNode);
        }
        return count;
    }

    public void addElements(final int[] elements) {
        for (int element:elements) {
            addNodeToTree(rootNode, element);
        }
    }

    public void addElement(final int element) {
        addNodeToTree(rootNode, element);
    }

    private boolean findElementRecursive(Node current, int value) {
        if (current == null) {
            return false;
        }
        if (current.getValue() == value) {
            return true;
        }

        if(value < current.getValue()) {
            return findElementRecursive(current.getLeftChild(),value);
        } else {
            return findElementRecursive(current.getRightChild(), value);
        }
    }

    public boolean findElement(final int value) {
        return findElementRecursive(rootNode, value);
    }

    public Node findCurrentNode(Node current, int value) {
        if (current.getValue() == value) {
            return current;
        }
        if(value < current.getValue()) {
            return findCurrentNode(current.getLeftChild(),value);
        } else {
            return findCurrentNode(current.getRightChild(), value);
        }
    }

    public int getLeftChild(int element) throws ChildNotFoundException {
        if (rootNode.isLeftChildEmpty()) {
            throw new ChildNotFoundException();
        }
        return rootNode.getLeftChild().getValue();
    };

    public int getRightChild(int element) throws ChildNotFoundException {
        if (rootNode.isRightChildEmpty()) {
            throw new ChildNotFoundException();
        }
        return rootNode.getRightChild().getValue();
    };

    public int[] getSortedTreeAsc() {
        count = 0;
        sortedTree = new int[getNumberOfElementsRecursive(rootNode)];
        if(!rootNode.isLeftChildEmpty()) {
            sortTreeAsc(rootNode);
        }
        return sortedTree;
    };

    private void sortTreeAsc(Node node) {
        if (!node.isLeftChildEmpty()) {
            sortTreeAsc(node.getLeftChild());
        }
        sortedTree[count] = node.getValue();
        count++;
        if (!node.isRightChildEmpty()) {
            sortTreeAsc(node.getRightChild());
        }
    }

    public int[] getSortedTreeDesc() {
        count = 0;
        sortedTree = new int[getNumberOfElementsRecursive(rootNode)];
        if(!rootNode.isRightChildEmpty()) {
            sortTreeDesc(rootNode);
        }
        return sortedTree;
    };

    private void sortTreeDesc(Node node) {
        if (!node.isRightChildEmpty()) {
            sortTreeDesc(node.getRightChild());
        }
        sortedTree[count] = node.getValue();
        count++;
        if (!node.isLeftChildEmpty()) {
            sortTreeDesc(node.getLeftChild());
        }
    }
}

