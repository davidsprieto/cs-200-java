package WeekEight.WorkshopEight;

public class Problem2 {

    public static void main(String[] args) {
        int[] a1 = {1, 21, 5, 9, 12, -50, 47};
        boolean[] b1 = multipleOfIndices(a1);
        printArray(b1);

        int[] a2 = {5, 3, 77, 34, 43};
        boolean[] b2 = multipleOfIndices(a2);
        printArray(b2);

        int[] a3 = {30, 22, 42, 8, 15, 27, 6};
        boolean[] b3 = multipleOfIndices(a3);
        printArray(b3);

        int[] a4 = {10, 51, 34, 69, 44, 95};
        boolean[] b4 = multipleOfIndices(a4);
        printArray(b4);
    }

    public static boolean[] multipleOfIndices(int[] array) {
        boolean[] boolArr = new boolean[array.length];
        for (int i = 2; i < array.length; i++) {
            if (array[0] % 10 == 0)
                boolArr[0] = true;
            if (array[1] % 10 == 1)
                boolArr[1] = true;
            if (array[i] % i == 0)
                boolArr[i] = true;
        }
        return boolArr;
    }

    public static void printArray(boolean[] boolArr) {
        System.out.print("{ ");
        for (int i = 0; i < boolArr.length; i++) {
            System.out.print(boolArr[i]);
            if (i < boolArr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" }");
    }

}
