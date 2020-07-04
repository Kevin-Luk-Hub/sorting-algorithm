package sorting;

public class selection_sort implements Algorithms {
    @Override
    public void runSort(int[] arr) {
        for(int i=0; i < arr.length-1; i++) {
            int currentMinIndex = i;
            for(int j=i+1; j < arr.length; j++) {
                if(arr[j] < arr[currentMinIndex]) {
                    currentMinIndex = j;
                }
            }
            if(currentMinIndex != i) {
                int temp = arr[i];
                arr[i] = arr[currentMinIndex];
                arr[currentMinIndex] = temp;
            }
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

        System.out.println("Selection sort was completed in " + completedTime + " milliseconds");
        System.out.println();
    }
}
