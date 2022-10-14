package WeekSeven.HomeworkSeven;

import java.util.Scanner;

public class Identical {

    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);

        System.out.print("Enter the lists length: ");
        int length = kbd.nextInt();

        int[] list1 = new int[length];
        int[] list2 = new int[length];

        System.out.print("Enter list 1: ");
        for (int i = 0; i < length; i++) {
            list1[i] = kbd.nextInt();
        }

        System.out.print("Enter list 2: ");
        for (int i = 0; i < length; i++) {
            list2[i] = kbd.nextInt();
        }

        System.out.println(checkIfIdentical(list1, list2, length));

    }

    public static String checkIfIdentical(int[] list1, int[] list2, int length) {
        for (int i = 0; i < length; i++) {
            if (list1[i] != list2[i]) {
               return "The lists are not identical.";
        }
    }
    return "The lists are identical.";
    }

}