package java_week_4_writinghw_humaira;

import java.util.Scanner;
/**
 * Read the numbers from the console entered by the user and print the minimum and maximum number
 * the user has entered.
 * -Before the user enters the number, print the message Enter number:
 * -If the user enters an invalid number, break out of the loop and print the minimum and maximum number.
 * Hint:
 * -Use an endless while loop.
 * -Create a class with the name MinAndMaxInputChallenge.
 */
public class P2_MinAndMaxInputChallenge {

    public static void findMinAndMaxNumbers() {
        //Scanner declaration for reading input from  console
        Scanner scan = new Scanner(System.in);
        int min = 0;
        int max = 0;
        boolean first = true;
        //while loop
        while (true) {
            System.out.println("Enter number: ");
            boolean isAnInt = scan.hasNextInt();
            if (isAnInt) {
                int number = scan.nextInt();
                if (first) {
                    first = false;
                    min = number;
                    max = number;
                }
                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }
            } else {
                break;
            }
            scan.nextLine(); // handle input
        }
        System.out.println("Min = " + min + " , Max = " + max);
        scan.close();
    }

    public static void main(String[] args) {
        findMinAndMaxNumbers();
    }
}
