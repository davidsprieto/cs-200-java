// CS200
// Fall, 2022
// David Prieto
// Instructor: Y. Gutstein
// HW #1: Elementary Programming
// Due: 09/09/2022
// HeightInches.java

package WeekTwo.Homework;

import java.util.Scanner;

public class HeightInches {

    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        System.out.print("Enter your height in inches: ");
        int inches = kbd.nextInt();
        int feet = inches / 12;
        int remainingInches = inches % 12;

        System.out.println("That is " + feet + " feet and " + remainingInches + " inches.");
    }

}
