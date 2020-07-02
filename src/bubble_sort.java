import java.util.ArrayList;
import java.util.List;

public class bubble_sort <T extends Comparable<T>> {

    public static <T extends Comparable<T>> void sort(T[] list) {
        for(int i=0; i < list.length; i++) {
            for(int j=0; j < list.length-1; j++) {
                if(list[j].compareTo(list[j+1]) > 0) {
                    T temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
            }
        }
    }

    public static <T extends Comparable<T>> void printArray(T[] list) {
        for(T x: list) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static <T extends Comparable<T>> void time(T[] list) {
        long starTime = System.nanoTime();
        sort(list);
        long endTime = System.nanoTime();
        long completedTime = (endTime - starTime) / 1000000;

        System.out.println("Bubble sort was completed in " + completedTime + " milliseconds");
        System.out.println();
    }
}
