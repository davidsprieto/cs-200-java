package WeekTen.WorkshopTen;

public class Problem1 {

    public static void main(String[] args) {
        int[] a = {2, 3};
        int[] a1 = noDuplicates(a);
        printArray(a1);

        int[] b = {2, 2};
        int[] b1 = noDuplicates(b);
        printArray(b1);

        int[] c = {1, 5, -4, 5, -4, 1, 0};
        int[] c1 = noDuplicates(c);
        printArray(c1);

        int[] d = {-2, 8, 9};
        int[] d1 = noDuplicates(d);
        printArray(d1);

        int[] e = {3, 3, 3, 3, 3};
        int[] e1 = noDuplicates(e);
        printArray(e1);
    }

    public static int[] noDuplicates(int[] a) {
        int[] arr;
        int length = a.length;

        for (int i = 1; i < a.length; i++) {
            int j;
            for (j = 0; j < i; j++) {
                if (a[j] == a[i]) {
                    length--;
                    break;
                }
            }
        }
        arr = new int[length];

        int index = 0;
        boolean exists = false;
        for (int i = 1; i < a.length; i++) {
            if (index == arr.length) {
                break;
            }
            for (int j = 0; j < i; j++) {
                if (a[j] == a[i]) {
                    exists = true;
                    arr[index] = a[i];
                    index++;
                    break;
                } else if ((i == a.length - 1) && (a[j] != a[i])) {
                    arr[index] = a[i];
                }
            }
        }
        if (!exists) {
            return a;
        } else {
            return arr;
        }
    }

    public static void printArray(int[] array) {
        System.out.print("{");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }

}
