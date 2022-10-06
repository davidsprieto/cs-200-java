// CS200
// Fall, 2022
// David Prieto
// Instructor: Y. Gutstein
// HW #1: For Loops
// Due: 10/07/2022
// ForLoop.java

package WeekSix.HomeworkSix;

import java.util.Scanner;

public class ForLoop {

    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);

        System.out.print("Enter a number greater than 1: ");
        int number = kbd.nextInt();
        int sum = 0;

        for (int i = 1; i <= number; i++) {
             sum += i;
        }
        System.out.println("The sum is " + sum);
    }

}
