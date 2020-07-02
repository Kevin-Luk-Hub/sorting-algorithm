import java.util.ArrayList;
import java.util.List;

public class bubble_sort <T extends Comparable<T>> {

    public static <T extends Comparable<T>> T[] sort(T[] list) {
        for(int i=0; i < list.length; i++) {
            for(int j=0; j < list.length-1; j++) {
                if(list[j].compareTo(list[j+1]) < 0) {
                    T temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
            }
        }

        return list;
    }

    public static <T extends Comparable<T>> void printArray(T[] list) {
        for(T x: list) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
