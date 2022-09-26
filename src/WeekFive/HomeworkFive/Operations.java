// CS200
// Fall, 2022
// David Prieto
// Instructor: Y. Gutstein
// HW #2: Methods
// Due: 09/30/2022
// Operations.java

package WeekFive.HomeworkFive;

public class Operations {
    public static void main(String[] args) {
        int c = 3729, d = 22, e = 34, f = 67;
         System.out.println(e + " * " + f + " is " + multiply(e, f));
         System.out.println(c + " / " + d + " is " + divide(c, d));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return add(a, -1 * b);
    }

    public static int multiply(int a, int b) {
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            sum += + b;
        }
        return sum;
    }

    public static int divide(int a, int b) {
        int quotient = 0;
        while (a > b) {
            a -= b;
            quotient++;
        }
        return quotient;
    }

}
