// CS200
// Fall, 2022
// David Prieto
// Instructor: Y. Gutstein
// HW #3: Arrays
// Due: 10/14/2022
// DistinctNumbers.java

package WeekSeven.HomeworkSeven;

import java.util.ArrayList;
import java.util.Scanner;

public class DistinctNumbers {

    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        int[] array = new int[10];

        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < 10; i++) {
            array[i] = kbd.nextInt();
        }

        ArrayList<Integer> unique = new ArrayList<>();
        unique.add(array[0]);
        int count = 1;

        for (int i = 1; i < array.length; i++) {
            int j;
            for (j = 0; j < i; j++)
                if (array[i] == array[j])
                    break;
            if (i == j) {
                count++;
                unique.add(array[i]);
            }
        }

        System.out.println("The number of unique numbers is: " + count);
        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < unique.size(); i++) {
            System.out.print(unique.get(i) + " ");
        }

    }

}



