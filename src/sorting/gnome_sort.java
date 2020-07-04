package sorting;

public class gnome_sort implements Algorithms {
    @Override
    public void runSort(int[] arr) {
        int index = 0;

        while (index < arr.length) {
            if(index == 0 || arr[index] >= arr[index-1]) {
                index++;
            } else {
                swap(arr, index, index-1);
                index--;
            }
        }
    }

    public static void swap(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    @Override
    public void printArray(int[] arr) {
        runSort(arr);
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

        System.out.println("Gnome sort was completed in " + completedTime + " milliseconds");
        System.out.println();
    }
}
