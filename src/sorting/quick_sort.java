package sorting;

public class quick_sort implements Algorithms{
    public void runSort(int[] list) {
        if(list.length <= 1) {
            return;
        }
        quickSort(list, 0, list.length-1);
    }

    public void quickSort(int arr[], int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            quickSort(arr, begin, partitionIndex-1);
            quickSort(arr, partitionIndex+1, end);
        }
    }

    private int partition(int arr[], int begin, int end) {
        int pivot = arr[end];
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = temp;

        return i+1;
    }

    public void printArray(int[] list) {
        for (int x : list) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public void getTime(int[] list) {
        long starTime = System.currentTimeMillis();
        runSort(list);
        long endTime = System.currentTimeMillis();
        long completedTime = endTime - starTime;

        System.out.println("Quick sort was completed in " + completedTime + " milliseconds");
        System.out.println();
    }
}
