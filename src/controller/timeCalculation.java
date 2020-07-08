package controller;

import sorting.*;

public class timeCalculation {
    public static void sortingTimes(int[] arr) {
        int[] mergeList = arr.clone();
        int[] quickList = arr.clone();
        int[] selectionList = arr.clone();
        int[] insertionList = arr.clone();
        int[] bubbleList = arr.clone();
        int[] gnomeList = arr.clone();

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

        System.out.println("Sorting completed!");
    }
}
