package WeekThree.Workshop;

import java.util.Scanner;

public class Makes10 {

    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);

        System.out.print("Please enter an integer: ");
        int firstInt = kbd.nextInt();

        System.out.print("Please enter another integer: ");
        int secondInt = kbd.nextInt();

        System.out.println("First number: " + firstInt);

        System.out.println("Second number: " + secondInt);

        boolean sum10 = firstInt + secondInt == 10;

        if (sum10) {
            System.out.println(firstInt + " + " + secondInt + " sums up to 10" );
        } else {
            System.out.println("Does not sum up to 10");
        }

        if ((firstInt == 10 || firstInt == -10) || (secondInt == 10 || secondInt == -10)) {
            System.out.println("One number is 10");
        } else {
            System.out.println("Neither number is 10");
        }

    }

}
