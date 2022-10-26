package WeekNine;

import java.util.Scanner;

public class MidtermProblem16 {

    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);

        System.out.print("Category: ");
        String category = kbd.nextLine();

        System.out.println(" ");

        if (category.equals("Batting Average")) {

            System.out.println("Enter scores (neg. # to quit). ");

            int values = 0;
            double score;
            double teamHigh = 0.0;
            double teamTotal = 0.0;
            double teamAverage;

            for (int i = 1; i <= 5; i++) {
                System.out.print("Enter player #" + i + ": ");
                score = kbd.nextDouble();

                if (score > 0) {
                    values++;
                    teamTotal += score;
                    if (score > teamHigh) {
                        teamHigh = score;
                    }
                } else {
                    break;
                }
            }
            teamAverage = teamTotal / values;
            System.out.println("Values entered: " + values);
            System.out.println("Team high: " + teamHigh);
            System.out.println("Team average: " + teamAverage);
        }
    }

}
