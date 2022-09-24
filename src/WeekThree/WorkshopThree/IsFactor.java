package WeekThree.WorkshopThree;

import java.util.Scanner;

public class IsFactor {

    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);

        System.out.print("Please enter an integer greater than 1: ");
        int firstInt = kbd.nextInt();

        System.out.print("Please enter another integer greater than 1: ");
        int secondInt = kbd.nextInt();

        if (firstInt % secondInt == 0) {
            System.out.println(secondInt + " is a factor of " + firstInt);
        } else if (secondInt % firstInt == 0) {
            System.out.println(firstInt + " is a factor of " + secondInt);
        } else {
            System.out.println("The numbers are not factors of each other");
        }

    }

}
