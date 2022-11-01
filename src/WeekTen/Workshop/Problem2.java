package WeekTen.Workshop;

public class Problem2 {

    public static void main(String[] args) {
        int[][] a = {{3, -2, 18},
                    {14, 0, 9}};
        int[][] a1 = transpose(a);
        printArray(a1);

        int[][] b = {{5, 8},
                    {6, 6},
                    {0, 4},
                    {-1, -2}};
        int[][] b1 = transpose(b);
        printArray(b1);
    }

    public static int[][] transpose(int[][] a) {
        int[][] arr = new int[a[0].length][a.length];

        for (int row = 0; row < a.length; row++) {
            for (int column = 0; column < a[0].length; column++) {
                arr[column][row] = a[row][column];
            }
        }
        return arr;
    }

    public static void printArray(int[][] a) {
        System.out.print("{{");
        for (int row = 0; row < a.length; row++) {
            for (int column = 0; column < a[0].length; column++) {
                System.out.print(a[row][column]);
                if (column < a[0].length - 1) {
                    System.out.print(", ");
                }
                if (row == a.length - 1 && column == a[0].length - 1) {
                    System.out.println("}};");
                    break;
                }
                if (column == a[0].length - 1) {
                    System.out.println("},");
                    System.out.print("{");
                }
            }
        }
    }

}
