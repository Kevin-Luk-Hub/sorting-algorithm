package sorting;

public class bubble_sort implements Algorithms {

    public void runSort(int[] list) {
        for(int i=0; i < list.length; i++) {
            for(int j=0; j < list.length-1; j++) {
                if(list[j] > list[j+1]) {
                    int temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
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

        System.out.println("Bubble sort was completed in " + completedTime + " milliseconds");
        System.out.println();
    }
}
