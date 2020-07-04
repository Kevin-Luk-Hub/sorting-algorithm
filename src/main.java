import sorting.*;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Scanner;

public class main {

    private static int[] createArray(int size) {
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * size);
        }

        return array;
    }

    public static void main(String[] args) {
        System.out.print("========================================================");
        System.out.println("\nWelcome to the sorting algorithm timer!");

        String timeStamp = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss aa")
                .format(new java.util.Date());
        System.out.println(timeStamp + '\n');

        Scanner input = new Scanner(System.in);

        System.out.print("Input an integer value for the size of the array: ");

        int size = input.nextInt();
        int[] array = createArray(size);

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

        mergeSort.getTime(mergeList);
        quickSort.getTime(quickList);
        selectionSort.getTime(selectionList);
        insertionSort.getTime(insertionList);
        bubbleSort.getTime(bubbleList);
        gnomeSort.getTime(gnomeList);

        System.out.print("========================================================");
    }
}
