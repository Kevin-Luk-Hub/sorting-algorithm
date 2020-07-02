public class selection_sort <T extends Comparable<T>> {

    public static <T extends Comparable<T>> void sort(T[] list) {
        for(int i=0; i < list.length-1; i++) {
            int currentMinIndex = i;
            for(int j=i+1; j < list.length; j++) {
                if(list[j].compareTo(list[currentMinIndex]) < 0) {
                    currentMinIndex = j;
                }
            }
            if(currentMinIndex != i) {
                T temp = list[i];
                list[i] = list[currentMinIndex];
                list[currentMinIndex] = temp;
            }
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
