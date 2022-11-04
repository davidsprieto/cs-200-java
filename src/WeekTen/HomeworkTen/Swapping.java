// CS200
// Fall, 2022
// David Prieto
// Instructor: Y. Gutstein
// HW #3: Arrays
// Due: 11/04/2022
// Swapping.java

package WeekTen.HomeworkTen;

import java.util.Scanner;

public class Swapping {

    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        System.out.print("Total numbers to input? ");
        int length = kbd.nextInt();

        System.out.print("Enter the numbers: ");
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = kbd.nextInt();
        }

        int[] swapped = swapEnds(array);
        System.out.print("After the shift: ");
        for (int i = 0; i < swapped.length; i++) {
            System.out.print(swapped[i] + " ");
        }

    }

    public static int[] swapEnds(int[] nums) {
        int temp = nums[0];
        nums[0] = nums[nums.length - 1];
        nums[nums.length - 1] = temp;
        return nums;
    }

}
