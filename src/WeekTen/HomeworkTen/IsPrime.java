// CS200
// Fall, 2022
// David Prieto
// Instructor: Y. Gutstein
// HW #1: Loops
// Due: 11/04/2022
// IsPrime.java

package WeekTen.HomeworkTen;

import java.util.Scanner;

public class IsPrime {

    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        System.out.print("Please enter a value greater than 0: ");
        int input = kbd.nextInt();

        while (input > 0) {

            if (isPrime(input)) {
                System.out.println(input + " IS a prime number.");
            } else {
                System.out.println(input + " is NOT a prime number.");
            }

            System.out.print("Enter 0 to quit or a value greater than 0 to determine if it is a prime number: ");
            input = kbd.nextInt();

        }
        System.out.println("Bye");
    }


    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
