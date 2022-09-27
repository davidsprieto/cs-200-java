package WeekFive.WokshopFive;

public class Problem1 {

    public static void main(String[] args) {
        int n1 = maxMod5(7, 5);
        System.out.println(n1);

        int n2 = maxMod5(-4, 3);
        System.out.println(n2);

        int n3 = maxMod5(6, 11);
        System.out.println(n3);

        int n4 = maxMod5(8, 8);
        System.out.println(n4);
    }

    public static int maxMod5(int a, int b) {
        if (a == b) {
            return 0;
        } else if (a % 5 == b % 5) {
            return Math.min(a, b);
        } else return Math.max(a, b);
    }

}
