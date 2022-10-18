package WeekEight.WorkshopEight;

public class Problem1 {

    public static void main(String[] args) {
        int[] a1 = {1, 2, 3};
        int n1 = maxThree(a1);
        System.out.println(n1);

        int[] a2 = {-8, -7, -2, 1, -3};
        int n2 = maxThree(a2);
        System.out.println(n2);

        int[] a3 = {9};
        int n3 = maxThree(a3);
        System.out.println(n3);
    }

    public static int maxThree(int[] array) {
        int max = array[0];
        int middle = array[array.length / 2];
        int last = array[array.length - 1];

        if (middle > max)
            max = middle;
        if (last > max)
            max = last;

        return max;
    }

}
