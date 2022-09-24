package WeekFour.Workshop;

import java.util.Scanner;

public class SplitWord {

    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = kbd.nextLine();

        int wordLength = word.length();
        char firstLetter = word.charAt(0);
        char midLetter = word.charAt(wordLength / 2);
        char lastLetter = word.charAt(wordLength - 1);

        System.out.println("The length of \"" + word + "\" is " + wordLength);
        System.out.println("The first letter is \"" + firstLetter + "\"");
        System.out.println("The middle letter is \"" + midLetter + "\"");
        System.out.println("The last letter is \"" + lastLetter + "\"" );
    }

}