package sorting;

public class merge_sort implements Algorithms {

    public void runSort(int[] list) {
        if (list.length <= 1) {
            return;
        }
        mergeBreakdown(list, 0, list.length - 1);
    }

    public void mergeBreakdown(int[] list, int low, int high) {
        if (low < high) {
            int mid = (high + low) / 2;
            mergeBreakdown(list, low, mid);
            mergeBreakdown(list, mid + 1, high);
            merge(list, low, mid, high);
        }
    }

    public void merge(int[] list, int low, int mid, int high) {
        int[] temp = new int[high + 1];

        for (int i = low; i <= high; i++) {
            temp[i] = list[i];
        }

        int i = low;
        int j = mid + 1;
        int k = low;

        while (i <= mid && j <= high) {
            if (temp[i] <= temp[j]) {
                list[k] = temp[i];
                i++;
            } else {
                list[k] = temp[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            list[k] = temp[i];
            k++;
            i++;
        }


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

        System.out.println("Merge sort was completed in " + completedTime + " milliseconds");
        System.out.println();
    }
}
