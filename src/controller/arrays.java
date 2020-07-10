package controller;

import java.io.IOException;
import java.util.Scanner;

public class arrays {
    private static int number;
    private static boolean isInteger;

    public static int getSize() throws IOException {
        isInteger = false;
        Scanner menuValue = new Scanner(System.in);

        while (!isInteger) {
            System.out.print("Enter an integer value for the size of the array: ");
            String checkInt = menuValue.next();

            try {
                number = Integer.parseInt(checkInt);
                isInteger = true;
            } catch (NumberFormatException e) {
                System.out.println("ERROR: Did not enter an integer value: " + menuValue);
                System.out.println();
            }
        }
        return number;
    }

    public static int[] createArray(int size) {
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * size);
        }

        return array;
    }
}
