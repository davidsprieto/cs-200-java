package WeekSeven.WorkshopSeven;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem3 {

    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);

        System.out.print("Enter n (> 1): ");
        int n = kbd.nextInt();

        System.out.print("Enter " + n + " integers followed by the space: ");
        int[] array = new int[n];

        ArrayList<Integer> nonZeroNumbers = new ArrayList<>();
        ArrayList<Integer> zeros = new ArrayList<>();
        int countNonZeros = 0;
        int countZeros = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = kbd.nextInt();
            if (array[i] > 0) {
                nonZeroNumbers.add(array[i]);
                countNonZeros++;
            } else {
                zeros.add(array[i]);
                countZeros++;
            }
        }
        nonZeroNumbers.addAll(zeros);

        if (countZeros == 0) {
            System.out.println("There are no zeros in the array.");
        } else {
            System.out.print("The new array with 0's at the end: ");
            for (int i = 0; i < nonZeroNumbers.size(); i++) {
                System.out.print(nonZeroNumbers.get(i) + " ");
            }
            System.out.println("\nThere are " + countZeros + " zeros in the array and there are " + countNonZeros + " integers before them.");
        }

    }

}
