// CS200
// Fall, 2022
// David Prieto
// Instructor: Y. Gutstein
// HW #1: Methods
// Due: 09/30/2022
// SortNumbers.java

package WeekFive.HomeworkFive;

import java.util.Arrays;
import java.util.Scanner;

public class SortNumbers {

    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num1 = kbd.nextInt();

        System.out.print("Enter a number: ");
        int num2 = kbd.nextInt();

        System.out.print("Enter a number: ");
        int num3 = kbd.nextInt();

        displaySortedNumbers(num1, num2, num3);

    }

    public static void displaySortedNumbers(int a, int b, int c) {
        int[] numbers = {a, b, c};
        Arrays.sort(numbers);
        for (int number : numbers) {
            System.out.print(number + " ");
        }

    }

}
