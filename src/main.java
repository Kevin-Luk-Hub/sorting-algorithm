import java.util.Arrays;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\n Welcome to the sorting algorithm timer! \n");

        Integer[] bubbleList = new Integer[]{1,6,2,4,3,8,9,0,-2};
        Integer[] insertionList = new Integer[]{1,6,2,4,3,8,9,0,-2};
        Integer[] selectionList = new Integer[]{1,6,2,4,3,8,9,0,-2};

        bubble_sort.sort(bubbleList);
        insertion_sort.sort(insertionList);
        selection_sort.sort(selectionList);

        System.out.println(Arrays.toString(bubbleList));
        System.out.println(Arrays.toString(insertionList));
        System.out.println(Arrays.toString(selectionList));
    }
}
