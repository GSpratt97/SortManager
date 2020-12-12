package com.sparta.greg.start;

import com.sparta.greg.sorters.*;

public class SorterFactory {
    public Sorter getSorter(String sorterType) {
        if (sorterType == null) {
            return null;
        }
        if (sorterType.equalsIgnoreCase("BubbleSort")) {
            return new BubbleSort();
        } else if (sorterType.equalsIgnoreCase("InsertionSort")) {
            return new InsertionSort();
        } else if (sorterType.equalsIgnoreCase("MergeSort")) {
            return new MergeSort();
        } else if (sorterType.equalsIgnoreCase("QuickSort")) {
            return new QuickSort();
        } else if (sorterType.equalsIgnoreCase("SelectionSort")) {
            return new SelectionSort();
        } else if (sorterType.equalsIgnoreCase("BinaryTreeSort")) {
            return new BinaryTreeSort();
        }
        return null;
    }
}


//        Printer.printMessage("1: BubbleSort");
//         Printer.printMessage("2: InsertionSort");
//         Printer.printMessage("3: MergeSort");
//         Printer.printMessage("4: QuickSort");
//         Printer.printMessage("5: SelectionSort");
//         Printer.printMessage("6: BinaryTreeSort");