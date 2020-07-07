package sorting;

public class quick_sort implements Algorithms {
    @Override
    public void runSort(int[] arr) {
        if (arr.length <= 1) {
            return;
        }
        quickSort(arr, 0, arr.length - 1);
    }

    public void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int partitionIndex = partition(arr, low, high);
            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }
    }

    private int partition(int arr[], int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high + 1;

        while (i < j) {
            do {
                i++;
            } while (i < high && arr[i] <= pivot);

            do {
                j--;
            } while (j > low && arr[j] > pivot);
            if (i < j) {
                swap(arr, i, j);
            }
        }

        swap(arr, low, j);

        return j;
    }

    public static void swap(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    @Override
    public void printArray(int[] arr) {
        for (int x : arr) {
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

        System.out.println("Quick sort was completed in " + completedTime + " milliseconds");
        System.out.println();
    }
}
