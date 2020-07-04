package sorting;

public class bubble_sort implements Algorithms {
    @Override
    public void runSort(int[] arr) {
        for(int i=0; i < arr.length; i++) {
            for(int j=0; j < arr.length-1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
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

        System.out.println("Bubble sort was completed in " + completedTime + " milliseconds");
        System.out.println();
    }
}
