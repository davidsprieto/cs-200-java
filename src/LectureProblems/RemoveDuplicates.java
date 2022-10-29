package LectureProblems;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] b = {2, 2};
        int[] b1 = createArrayWithDuplicates(b);
        printArray(b1);

        int[] c = {1, 5, -4, 5, -4, 1, 0};
        int[] c1 = createArrayWithDuplicates(c);
        printArray(c1);

        int[] d = {-2, 8, 9};
        int[] d1 = createArrayWithDuplicates(d);
        printArray(d1);
    }

    public static int[] createArrayWithDuplicates(int[] a) {
        int[] arr;
        int l = 0;
        int index = 0;

        for (int i = 1; i < a.length; i++) {
            int j;
            for (j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    l++;
                }
            }
        }
        arr = new int[l];

        for (int i = 1; i < a.length; i++) {
            int j;
            for (j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    arr[index] = a[i];
                    index++;
                }
            }
        }
        return arr;
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
