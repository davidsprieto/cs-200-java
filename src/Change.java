import java.util.Scanner;

public class Change {

    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        int cost, change, nickels, dimes, quarters;

        System.out.print("Enter item cost in cents: ");
        cost = kbd.nextInt();

        change = 100 - cost;
        quarters = change / 25;
        change = change % 25;
        dimes = change / 10;
        change = change % 10;
        nickels = change / 5;
        change = change % 5;

        System.out.println("Total change: " + change);
        System.out.println("Your change is: \n" + quarters + " quarters \n" + dimes + " dimes \n" + nickels + " nickels");

    }

}
