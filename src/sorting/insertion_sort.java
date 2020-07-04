package sorting;

public class insertion_sort implements Algorithms {
    @Override
    public void runSort(int[] arr) {
        for(int i=1; i < arr.length; i++) {
            int compareVal = arr[i];
            int j = i-1;
            while(j >=0 && compareVal < arr[j]) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = compareVal;
        }
    }

    @Override
    public void printArray(int[] arr) {
        for(int x: arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    @Override
    public void getTime(int[] arr) {
        long starTime = System.currentTimeMillis();
        runSort(arr);
        long endTime = System.currentTimeMillis();
        long completedTime = endTime - starTime;

        System.out.println("Insertion sort was completed in " + completedTime + " milliseconds");
        System.out.println();
    }
}
