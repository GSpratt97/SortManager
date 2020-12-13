# SortManager #

Welcome to the sort manager!

## About ##

This project was built using Intellij within Java and is used to compare different sorting algorithms and assess which work most effectively.

Sorting algorithms in this project are:

Sort Algorithm | Description
---------------|------------
Bubble Sort    | Bubble sort is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements and swaps them if they are in the wrong order. The pass through the list is repeated until the list is sorted.
Insertion Sort | Insertion sort is a sorting algorithm in which the elements are transferred one at a time to the right position. In other words, an insertion sort helps in building the final sorted list, one item at a time, with the movement of higher-ranked elements.
Merge Sort     | Merge sort is a divide and conquer algorithm. It uses recursion to produce sorted sublists until there is only one sublist remaining and adds all sorted numbers back together in the array.
Quick Sort     | Quicksort is another divide and conquer algorithm. It works by selecting a 'pivot' element from the array and partitioning the other elements into two sub-arrays, according to whether they are less than or greater than the pivot.
Selection Sort | The algorithm divides the input list into two parts: a sorted sublist of items which is built up from left to right at the front (left) of the list and a sublist of the remaining unsorted items that occupy the rest of the list.
Binary Tree Sort| A tree sort is a sort algorithm that builds a binary search tree from the elements to be sorted, and then traverses the tree (in-order) so that the elements come out in sorted order.

The project made use of JUnit, Maven, factory design patterns, Log4j, randomisation and inputs via the scanner.

A log containing information of the program flow can be seen in the target/log/sortLog.log file.

## How to use ##

1. Open this project in an IDE of your choice.
2. Run the Main class in the start package.
3. The program will prompt in the console asking to input a number to choose a sort algorithm.
4. Input a number to choose an algorithm.
5. Next enter a desired array length, this will generate a random array to be sorted.
6. The algorithm will then print to the console: 
    1. The random array 
    2. The chosen sort algorithm
    3. The array sorted by chosen algorithm
    4. The time taken for the method to sort the array.
     