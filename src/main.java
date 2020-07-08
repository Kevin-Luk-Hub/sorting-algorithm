import controller.arrays;
import controller.timeCalculation;

import java.io.IOException;
import java.text.SimpleDateFormat;

public class main {
    public static void main(String[] args) throws IOException {
        System.out.println("\nWelcome to the sorting algorithm timer!");

        String timeStamp = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss aa")
                .format(new java.util.Date());
        System.out.println(timeStamp + '\n');

        int size = arrays.getSize();
        int[] array = arrays.createArray(size);

        timeCalculation.sortingTimes(array);
    }
}
