import java.util.Scanner;

public class main {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the sorting algorithm timer!");
        Integer[] list = new Integer[]{1,6,2,4,3,8,9,0,-2};
        Integer[] sorted = bubble_sort.sort(list);
        bubble_sort.printArray(sorted);
    }
}
