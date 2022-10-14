// CS200
// Fall, 2022
// David Prieto
// Instructor: Y. Gutstein
// HW #1: Arrays
// Due: 10/14/2022
// Reverse.java

package WeekSeven.HomeworkSeven;

import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);

        System.out.print("Please enter 10 integers: ");

        int[] array = new int[10];

        for (int i = 0; i < 10; i++) {
            array[i] = kbd.nextInt();
        }

        System.out.print("The reverse is: ");
        for (int i = 9; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }

    }

}
