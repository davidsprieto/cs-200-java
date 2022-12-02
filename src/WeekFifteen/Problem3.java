package WeekFifteen;

public class Problem3 {

    public static void main(String[] args) {
        int[][] a1 = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {2, 1, 5, 9},
                {10, 2, 3, 10}};
        System.out.println(diagSquare(a1));

        int[][] a2 = {{3, 4, 7, 10},
                {19, 50, 4, 6},
                {2, 5, 11, 74},
                {1, 2, 3, 4}};
        System.out.println(diagSquare(a2));
    }

    public static boolean diagSquare(int[][] arr) {
        int sum1 = 0, sum2 = 0, col1 = 0, col2 = arr[col1].length - 1;

        for (int row = 0; row < arr.length; row++) {
            sum1 += arr[row][col1];
            col1++;
            sum2 += arr[row][col2];
            col2--;
        }
        return (sum1 == sum2);
    }

}
