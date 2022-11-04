// CS200
// Fall, 2022
// David Prieto
// Instructor: Y. Gutstein
// HW #2: Loops
// Due: 11/04/2022
// OpenTriangle.java

package WeekTen.HomeworkTen;

import java.util.Scanner;

public class OpenTriangle {

    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        System.out.print("Enter a triangle height greater than 1: ");
        int input = kbd.nextInt();

        for (int row = 1; row <= input; row++) {
            for (int column = 1; column <= row; column++) {
                if (row == column) {
                    System.out.print("*");
                } else if (column == 1) {
                    System.out.print("* ");
                } else {
                    if (row == input) {
                        System.out.print("* ");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

}
