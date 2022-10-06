// CS200
// Fall, 2022
// David Prieto
// Instructor: Y. Gutstein
// HW #3: Loops
// Due: 10/07/2022
// SmallestN.java

package WeekSix.HomeworkSix;

import java.util.Scanner;

public class SmallestN {

    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);

        System.out.print("Enter a number larger than 10: ");
        int input = kbd.nextInt();

        for (int i = 1; i <= input; i++) {
            if (i * i > input) {
                System.out.println("The smallest value for n that gives n * n > " + input + " is " + i);
                return;
            }
        }

    }

}
