// CS200
// Fall, 2022
// David Prieto
// Instructor: Y. Gutstein
// HW #2: While Loops
// Due: 10/07/2022
// WhileLoop.java

package WeekSix.HomeworkSix;

import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);
        double score = 0.0, sum = 0.0, avg;
        int count = 0;

        while (score != -1) {
            System.out.print("Enter a score between 0 and 100 or -1 to exit: ");
            score = kbd.nextDouble();

            if (score != -1) {
                sum += score;
                count++;
            }
        }
        avg = sum / count;
        System.out.println("The average is " + avg);

    }

}
