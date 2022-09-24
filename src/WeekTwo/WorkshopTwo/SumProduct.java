package WeekTwo.WorkshopTwo;

import java.util.Scanner;

public class SumProduct {

    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        String fullName;
        int firstInt;
        int secondInt;
        int productOfInts;
        int sumOfInts;

        System.out.print("What is your name? ");
        fullName = kbd.nextLine();

        System.out.print("Enter two integers: ");
        firstInt = kbd.nextInt();
        secondInt = kbd.nextInt();

        System.out.println("");

        System.out.println("Hi " + fullName + "." + " You entered " + firstInt + " and " + secondInt);

        System.out.println("");

        productOfInts = firstInt * secondInt;
        System.out.println("The product of " + firstInt + " x " + secondInt + " is " + productOfInts);

        sumOfInts = firstInt + secondInt;
        System.out.println("The sum of " + firstInt + " + " + secondInt + " is " + sumOfInts);
    }

}
