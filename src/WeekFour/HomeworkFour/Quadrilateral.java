// CS200
// Fall, 2022
// David Prieto
// Instructor: Y. Gutstein
// HW #2: Characters and Strings
// Due: 09/23/2022
// Quadrilateral.java

package WeekFour.HomeworkFour;

import java.util.Scanner;

public class Quadrilateral {

    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);

        System.out.print("Enter the length: ");
        double length = kbd.nextDouble();

        System.out.print("Enter the width: ");
        double width = kbd.nextDouble();

        if (length == width) {
            System.out.println("It's a square!");
            width += 1;
            System.out.println("The width is now " + width + ".");
            if (length != width) {
                System.out.println("It's a rectangle!");
            }
        } else {
            System.out.println("It's a rectangle!");
            width += 1;
            System.out.println("The width is now " + width + ".");
            if (length == width) {
                System.out.println("It's a square!");
            } else {
                System.out.println("It's a rectangle!");
            }
        }

    }

}
