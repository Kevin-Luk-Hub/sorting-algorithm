public class insertion_sort<T extends Comparable<T>> {

    public static <T extends Comparable<T>> void sort(T[] list) {
        for(int i=1; i < list.length; i++) {
            T compareVal = list[i];
            int j = i-1;
            while(j >=0 && compareVal.compareTo(list[j]) < 0) {
                list[j+1] = list[j];
                j--;
            }
            list[j+1] = compareVal;
        }
    }

    public static <T extends Comparable<T>> void printArray(T[] list) {
        for (T x : list) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static <T extends Comparable<T>> void time(T[] list) {
        long starTime = System.nanoTime();
        sort(list);
        long endTime = System.nanoTime();
        long completedTime = (endTime - starTime) / 1000000;

        System.out.println("Insertion sort was completed in " + completedTime + " milliseconds");
        System.out.println();
    }
}
