package sorting;

public class insertion_sort implements Algorithms {

    public void runSort(int[] list) {
        for(int i=1; i < list.length; i++) {
            int compareVal = list[i];
            int j = i-1;
            while(j >=0 && compareVal < list[j]) {
                list[j+1] = list[j];
                j--;
            }
            list[j+1] = compareVal;
        }
    }

    public void printArray(int[] list) {
        for(int x: list) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public void getTime(int[] list) {
        long starTime = System.currentTimeMillis();
        runSort(list);
        long endTime = System.currentTimeMillis();
        long completedTime = endTime - starTime;

        System.out.println("Insertion sort was completed in " + completedTime + " milliseconds");
        System.out.println();
    }
}
