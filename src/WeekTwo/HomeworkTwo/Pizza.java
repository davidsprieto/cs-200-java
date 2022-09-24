// CS200
// Fall, 2022
// David Prieto
// Instructor: Y. Gutstein
// HW #1: Elementary Programming
// Due: 09/09/2022
// Pizza.java

package WeekTwo.HomeworkTwo;

public class Pizza {

    public static void main(String[] args) {
        double smallPizza = 7;
        double largePizza = 14;
        double differenceInPizza = (Math.pow(largePizza, 2)) - (Math.pow(smallPizza, 2));
        double sharedPizza = (Math.pow(largePizza, 2)) / 6;

        System.out.println("Two 7 inch pizzas will get you " + ((Math.pow(smallPizza, 2)) + (Math.pow(smallPizza, 2))) + " square inches of pizza.");
        System.out.println("One 14 inch pizza will get you " + (Math.pow(largePizza, 2)) + " square inches of pizza.");
        System.out.println("You will get " + differenceInPizza + " more square inches of pizza if you order a 14 inch pizza instead of a 7 inch pizza.");
        System.out.println("If you shared a 14 inch pizza with 5 friends you will get to eat " + sharedPizza + " square inches of pizza.");
    }

}
