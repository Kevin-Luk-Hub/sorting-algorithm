package controller;

import java.io.IOException;
import java.util.Scanner;

public class arrays {
    public static int getSize() throws IOException {
        while (true) {
            System.out.print("Enter an integer value for the size of the array: ");
            Scanner menuValue = new Scanner(System.in);
            String checkInt = menuValue.next();

            try {
                int x = Integer.parseInt(checkInt);
                return x;
            } catch (NumberFormatException e) {
                System.out.println("ERROR: Did not enter an integer value.");
                System.out.println();
            }
        }
    }

    public static int[] createArray(int size) {
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * size);
        }

        return array;
    }
}
