package WeekEight.WorkshopEight;

import java.util.ArrayList;

public class Problem3 {

    public static void main(String[] args) {
        int[] a1 = {1, 4, 16, -19, -12, 2, 5};
        int[] x1 = greaterThanSum(a1);
        printArray(x1);

        int[] a2 = {-1, -2, -4, -12};
        int[] x2 = greaterThanSum(a2);
        printArray(x2);

        int[] a3 = {29, -10, 22, 5, -15, 19, 62};
        int[] x3 = greaterThanSum(a3);
        printArray(x3);

        int[] a4 = {5, 8, 17, 50};
        int[] x4 = greaterThanSum(a4);
        printArray(x4);
    }

    public static int[] greaterThanSum(int[] a) {
        ArrayList<Integer> list = new ArrayList<>();

        if (a[0] > 0)
            list.add(a[0]);

        for (int i = 1; i < a.length; i++) {
            int sum = 0;
            for (int j = 0; j < i; j++) {
                sum += a[j];
            }
            if (a[i] > sum) {
                list.add(a[i]);
            }
        }
        return convertToArray(list);
    }

    public static int[] convertToArray(ArrayList<Integer> list) {
        int[] x = new int[list.size()];
        for (int i = 0; i < x.length; i++) {
            x[i] = list.get(i);
        }
        return x;
    }

    public static void printArray(int[] array) {
        System.out.print("{ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" }");
    }

}
