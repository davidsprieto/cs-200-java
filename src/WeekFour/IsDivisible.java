// CS200
// Fall, 2022
// David Prieto
// Instructor: Y. Gutstein
// HW #3: Characters and Strings
// Due: 09/23/2022
// IsDivisible.java

package WeekFour;

import java.util.Scanner;

public class IsDivisible {

    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);

        System.out.print("Please enter the dividend: ");
        int dividend = kbd.nextInt();

        System.out.print("Please enter the divisor: ");
        int divisor = kbd.nextInt();

        if (dividend % divisor == 0) {
            System.out.println(dividend + " is divisible by " + divisor);
        } else {
            System.out.println(dividend + " is not divisible by " + divisor);
        }

    }

}
