// CS200
// Fall, 2022
// David Prieto
// Instructor: Y. Gutstein
// HW #2: Selections (If-Else)
// Due: 09/16/2022
// RaceResults.java

package HomeworkTwo;

import java.util.Scanner;

public class RaceResults {

    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);

        System.out.print("Enter the first runner's name: ");
        String runnerOne = kbd.next();

        System.out.print("Enter the first runner's time in minutes: ");
        double runnerOneTime = kbd.nextDouble();

        System.out.print("Enter the second runner's name: ");
        String runnerTwo = kbd.next();

        System.out.print("Enter the second runner's time in minutes: ");
        double runnerTwoTime = kbd.nextDouble();

        System.out.print("Enter the third runner's name: ");
        String runnerThree = kbd.next();

        System.out.print("Enter the third runner's time in minutes: ");
        double runnerThreeTime = kbd.nextDouble();

        String first = null;
        String second = null;
        String third = null;

        if ((runnerOneTime < runnerTwoTime) && (runnerOneTime < runnerThreeTime)) {
            first = runnerOne + " - " + runnerOneTime;
        } else if ((runnerTwoTime < runnerOneTime) && (runnerTwoTime < runnerThreeTime))
            first = runnerTwo + " - " + runnerTwoTime;
        else {
            first = runnerThree + " - " + runnerThreeTime;
        }

        if ((runnerOneTime < runnerTwoTime) && (runnerOneTime > runnerThreeTime)) {
            second = runnerOne + " - " + runnerOneTime;
        } else if ((runnerTwoTime < runnerOneTime) && (runnerTwoTime > runnerThreeTime))
            second = runnerTwo + " - " + runnerTwoTime;
        else {
            second = runnerThree + " - " + runnerThreeTime;
        }

        if ((runnerOneTime > runnerTwoTime) && (runnerOneTime > runnerThreeTime)) {
            third = runnerOne + " - " + runnerOneTime;
        } else if ((runnerTwoTime > runnerOneTime) && (runnerTwoTime > runnerThreeTime))
            third = runnerTwo + " - " + runnerTwoTime;
        else {
            third = runnerThree + " - " + runnerThreeTime;
        }

        System.out.println(
                "Results: \n" +
                "First place: " + first + "\n" +
                "Second place: " + second + "\n" +
                "Third place: " + third + "\n");

    }

}
