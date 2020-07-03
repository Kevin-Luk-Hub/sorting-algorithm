package sorting;

public class selection_sort implements Algorithms {

    public void runSort(int[] list) {
        for(int i=0; i < list.length-1; i++) {
            int currentMinIndex = i;
            for(int j=i+1; j < list.length; j++) {
                if(list[j] < list[currentMinIndex]) {
                    currentMinIndex = j;
                }
            }
            if(currentMinIndex != i) {
                int temp = list[i];
                list[i] = list[currentMinIndex];
                list[currentMinIndex] = temp;
            }
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

        System.out.println("Selection sort was completed in " + completedTime + " milliseconds");
        System.out.println();
    }
}
