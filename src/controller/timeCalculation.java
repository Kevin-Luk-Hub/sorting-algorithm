package controller;

import sorting.*;

import java.io.IOException;

import static controller.exitCheck.askExit;

public class timeCalculation {
    public static void sortingTimes() throws IOException {
            int size = arrays.getSize();
            int[] array = arrays.createArray(size);

            int[] mergeList = array.clone();
            int[] quickList = array.clone();
            int[] selectionList = array.clone();
            int[] insertionList = array.clone();
            int[] bubbleList = array.clone();
            int[] gnomeList = array.clone();

            merge_sort mergeSort = new merge_sort();
            quick_sort quickSort = new quick_sort();
            selection_sort selectionSort = new selection_sort();
            insertion_sort insertionSort = new insertion_sort();
            bubble_sort bubbleSort = new bubble_sort();
            gnome_sort gnomeSort = new gnome_sort();

            System.out.println("\nSorting the arrays...");

            mergeSort.getTime(mergeList);
            quickSort.getTime(quickList);
            selectionSort.getTime(selectionList);
            insertionSort.getTime(insertionList);
            bubbleSort.getTime(bubbleList);
            gnomeSort.getTime(gnomeList);

            System.out.println("Sorting completed!\n");

            askExit();
    }
}
