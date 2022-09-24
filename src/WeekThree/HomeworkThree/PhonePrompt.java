// CS200
// Fall, 2022
// David Prieto
// Instructor: Y. Gutstein
// HW #2: Selections (If-Else)
// Due: 09/16/2022
// PhonePrompt.java

package WeekThree.HomeworkThree;

import java.util.Scanner;

public class PhonePrompt {

    public static void main(String[] args) {

        System.out.println(
                "Hello, you've reached the main menu of Pay The Man Company. Please listen closely as all of our menu options have changed. \n" +
                "Press 1 for Accounting. \n" +
                "Press 2 for HR. \n" +
                "Press 3 for IT. \n" +
                "Press 4 for Customer Service. \n" +
                "Press 5 to speak to the operator.");

        Scanner kbd = new Scanner(System.in);

        System.out.print("Your choice: ");
        int option = kbd.nextInt();

        if (option == 0 || option >= 6 ) {
            System.out.println("Invalid entry, please hang up and try again.");
        } else if (option == 1) {
            System.out.println("Good day, you have reached the accounting department, and we are very busy crunching numbers, please leave a message.");
        } else if (option == 2) {
            System.out.println("Good day, you have reached the human resources department, and we are very busy training employees, please leave a message.");
        } else if (option == 3 ) {
            System.out.println("Good day, you have reached the information technology department, and we are very busy fixing network issues, please leave a message.");
        } else if (option == 4) {
            System.out.println("Good day, you have reached customer service, and all of our representatives are busy at the moment, please leave a message.");
        } else if (option == 5) {
            System.out.println("Hello, this is the operator how may I assist you?");
        }

    }

}
