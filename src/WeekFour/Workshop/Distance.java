package WeekFour.Workshop;

import java.util.Scanner;

public class Distance {

    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);

        System.out.print("Enter x1: ");
        double x1 = kbd.nextInt();

        System.out.print("Enter y1: ");
        double y1 = kbd.nextInt();

        System.out.print("Enter x2: ");
        double x2 = kbd.nextInt();

        System.out.print("Enter y2: ");
        double y2 = kbd.nextInt();

        double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        System.out.println("The distance is: " + distance + ".");
    }

}
