package controller;

import java.io.IOException;
import java.util.Scanner;

public class exitCheck {
    private static boolean isExit;

    public static void askExit() {
        Scanner input = new Scanner(System.in);
        isExit = false;

        while(!isExit) {
            System.out.println("Enter option 1 to input another array size.");
            System.out.println("Enter option 2 exit the program.");
            System.out.println("Option: ");

            String option = input.next();

            try {
                int x = Integer.parseInt(option);
                if(x == 1) {
                    isExit = true;
                    timeCalculation.sortingTimes();
                } else if(x == 2) {
                    System.out.println("Exiting program... ");
                    System.exit(0);
                }
            } catch (NumberFormatException e) {
                System.out.println("ERROR: Did not enter an option. Please try again.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
