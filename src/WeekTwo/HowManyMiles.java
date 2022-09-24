package WeekTwo;

import java.util.Scanner;

public class HowManyMiles {

    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        int miles;
        System.out.print("Enter a distance in miles: ");
        miles = kbd.nextInt();

        int milesInInches = miles * 5280 * 12;
        System.out.println("The distance in inches is: " + milesInInches);

        int inchesToFeet = ((milesInInches + 5) * 2) / 12;
        System.out.println("Your new distance is " + inchesToFeet + " ft." + " and 5 in.");

        double newMiles = (double) inchesToFeet / 5280;
        System.out.println("The total miles is now " + newMiles);
    }

}
