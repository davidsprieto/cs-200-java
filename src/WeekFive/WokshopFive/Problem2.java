package WeekFive.WokshopFive;

public class Problem2 {

    public static void main(String[] args) {
        boolean b1 = evenlySpaced(2,4, 6);
        System.out.println(b1);

        boolean b2 = evenlySpaced(4,6, 2);
        System.out.println(b2);

        boolean b3 = evenlySpaced(4,6, 3);
        System.out.println(b3);

        boolean b4 = evenlySpaced(15, 5, 10);
        System.out.println(b4);
    }

    public static boolean evenlySpaced(int a, int b, int c) {
        return (a - b == b - c) || (a - c == c - b) || (a - b == c - a);
    }

}
