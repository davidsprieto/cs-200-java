// CS200
// Fall, 2022
// David Prieto
// Instructor: Y. Gutstein
// HW #4: Loops
// Due: 10/07/2022
// DivisibleLines.java

package WeekSix.HomeworkSix;

import java.util.Scanner;

public class DivisibleLines {

    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);

        System.out.print("Enter a number larger than 20: ");
        int input = kbd.nextInt();
        int count = 0;

        for (int i = 1; i <= input; i++) {

            if (i % 2 == 0 && i % 3 == 0) {
                System.out.print("");
            } else if (i % 2 == 0 || i % 3 == 0) {
                System.out.print(i + " ");
                count++;
            }

            if (count != 0 && count % 10 == 0) {
                System.out.println(" ");
            }

        }

    }

}
