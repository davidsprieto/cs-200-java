package WeekSix.WorkshopSix;

import java.util.Scanner;

public class Problem2 {

    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);

        int input, previous = 0, big = 0, small = 0;
        String str = "Enter a positive integer: ";

        System.out.print(str);
        input = kbd.nextInt();

        while (input > 0 && input > previous) {
            previous = input;

            System.out.print(str);
            input = kbd.nextInt();

            if (input > 0 && input > previous) {
                if (input - previous > 5) {
                    big++;
                } else if (input - previous <= 5) {
                    small++;
                }
            }
        }
        System.out.println("Big steps: " + big);
        System.out.println("Small steps: " + small);
        System.out.println("Ending value: " + input);
    }

}
