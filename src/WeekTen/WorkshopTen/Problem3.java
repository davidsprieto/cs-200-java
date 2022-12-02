package WeekTen.WorkshopTen;

public class Problem3 {

    public static void main(String[] args) {
        int[][] arr1 = {{1, 2, 4, 0},
                        {3, 4, 5, 6},
                        {7, 8, 9, 12}};

        int[][] a1 = deepReverse(arr1);
        printArray(a1);

        int[][] arr2 = {{2, 8},
                        {7, 20},
                        {9, 3},
                        {5, 12}};

        int[][] a2 = deepReverse(arr2);
        printArray(a2);
    }

    public static int[][] deepReverse(int[][] a) {
        int c = 0;
        int r = 0;
        for (int row = 0; row < a.length; row++) {
            if (r == c - 1) {
                break;
            }
            r++;
            c = 1;
            for (int column = 0; column < a[0].length; column++) {
                if ((((a.length + a[0].length) / 2) == (r)) || (((a.length + a[0].length) / 2) == (c)) && (row > 0)) {
                    break;
                }
                int temp = a[row][column];
                a[row][column] = a[a.length - r][a[0].length - c];
                a[a.length - r][a[0].length - c] = temp;
                c++;
            }
        }
        return a;
    }

    public static void printArray(int[][] a) {
        System.out.print("{{");
        for (int row = 0; row < a.length; row++) {
            for (int column = 0; column < a[row].length; column++) {
                System.out.print(a[row][column]);
                if (column < a[row].length - 1) {
                    System.out.print(", ");
                }
                if (row == a.length - 1 && column == a[row].length - 1) {
                    System.out.println("}};");
                    break;
                }
                if (column == a[row].length - 1) {
                    System.out.println("},");
                    System.out.print("{");
                }
            }
        }
        System.out.println("");
    }

}
