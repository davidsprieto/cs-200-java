package WeekSeven.WorkshopSeven;

import java.util.Scanner;

public class Problem1 {

    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);

        System.out.print("Enter n (> 0): ");
        int n = kbd.nextInt();

        System.out.print("Enter " + n + " integers: ");
        int[] array = new int[n];

        int minimum = 0;

        for (int i = 0; i < n; i++) {
            array[i] = kbd.nextInt();
            if (array[i] < array[minimum])
                minimum = i;
        }

        if (minimum == n - 1) {
            System.out.println("No numbers after min");
        } else {
            System.out.print("After minimum: ");
            for (int i = minimum + 1; i < n; i++) {
                System.out.print(array[i] + " ");
            }
        }
    }

}