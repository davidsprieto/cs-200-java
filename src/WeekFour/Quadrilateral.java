package WeekFour;

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
