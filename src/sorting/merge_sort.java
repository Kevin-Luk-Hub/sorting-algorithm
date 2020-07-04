package sorting;

public class merge_sort implements Algorithms {
    @Override
    public void runSort(int[] arr) {
        if (arr.length <= 1) {
            return;
        }
        mergeBreakdown(arr, 0, arr.length - 1);
    }

    public void mergeBreakdown(int[] arr, int low, int high) {
        if (low < high) {
            int mid = (high + low) / 2;
            mergeBreakdown(arr, low, mid);
            mergeBreakdown(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }

    public void merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high + 1];

        for (int i = low; i <= high; i++) {
            temp[i] = arr[i];
        }

        int i = low;
        int j = mid + 1;
        int k = low;

        while (i <= mid && j <= high) {
            if (temp[i] <= temp[j]) {
                arr[k] = temp[i];
                i++;
            } else {
                arr[k] = temp[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            arr[k] = temp[i];
            k++;
            i++;
        }
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

        System.out.println("Merge sort was completed in " + completedTime + " milliseconds");
        System.out.println();
    }
}
