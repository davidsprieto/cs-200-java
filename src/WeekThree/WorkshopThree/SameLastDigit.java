package WeekThree.WorkshopThree;

import java.util.Scanner;

public class SameLastDigit {

    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);

        System.out.print("Please enter an integer: ");
        int firstInt = kbd.nextInt();

        System.out.print("Please enter another integer: ");
        int secondInt = kbd.nextInt();

        System.out.println("First number: " + firstInt);

        System.out.println("Second number: " + secondInt);

        firstInt = firstInt % 10;

        secondInt = secondInt % 10;

        if (firstInt == secondInt) {
            System.out.println("Same last digit");
        } else {
            System.out.println("Different last digits");
        }

    }

}
