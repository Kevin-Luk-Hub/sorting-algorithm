public class insertion_sort<T extends Comparable<T>> {

    public static <T extends Comparable<T>> T[] sort(T[] list) {
        return list;
    }

    public static <T extends Comparable<T>> void printArray(T[] list) {
        for (T x : list) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
