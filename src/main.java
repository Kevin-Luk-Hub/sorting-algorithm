import sorting.*;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Scanner;

public class main {

    private static int getSize() throws IOException {
        while (true) {  // main menu will continue to show until user quits program
            System.out.print("Enter an integer value for the size of the array: ");
            Scanner menuValue = new Scanner(System.in);
            String checkInt = menuValue.next();

            try {
                int x = Integer.parseInt(checkInt);
                return x;
            } catch (NumberFormatException e) { // catch if user does not input a number for the menu option
                System.out.println("ERROR: Did not enter an integer value.");
                System.out.println();
            }
        }
    }

    private static int[] createArray(int size) {
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * size);
        }

        return array;
    }

    public static void main(String[] args) throws IOException {
        System.out.println("\nWelcome to the sorting algorithm timer!");

        String timeStamp = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss aa")
                .format(new java.util.Date());
        System.out.println(timeStamp + '\n');

        int size = getSize();
        int[] array = createArray(size);

        timeCalculation.sortingTimes(array);
    }
}
