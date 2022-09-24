package WeekTwo;

public class Tracing {

    public static void main(String[] args) {
        tracing4();
        tracing5();
    }

    public static void tracing4() {
        int a = 2, b = 7, m = 6, n = 3, o = 14;
        double d = 2.0;
        String c = "Fall";

        System.out.println(a + b - m + n);
        System.out.println(n - a + "" + (o - b));
        System.out.println(c + d + (b - m) + (o - b));
        System.out.println(a * b % a + m / n);
        System.out.println(b / a + c + m % n);
    }

    public static void tracing5() {
        int u = 2, v = 3, w = 5, x = 7, y = 11;
        String s = "Spring";

        System.out.println(u + v * w + x);
        System.out.println(u + y % v * w + x);
        System.out.println(u / v * w);
        System.out.println(v + s + x / v);
    }

}
