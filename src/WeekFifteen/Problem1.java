package WeekFifteen;

import java.util.Arrays;

public class Problem1 {

    public static void main(String[] args) {
        int[] x1 = {4, 3, 5, 2};
        char[] y1 = {'Q', 'W', 'r', 'b'};
        char[][] z1 = repeatChar(x1, y1);
        print2DArray(z1);

        int[] x2 = {5, 2, 3, 4, 1};
        char[] y2 = {'@', '!', '<', 'S', 'm'};
        char[][] z2 = repeatChar(x2, y2);
        print2DArray(z2);
    }

    public static char[][] repeatChar(int[] arr, char[] ch) {
        char[][] dimArr = new char[arr.length][];
        for (int i = 0; i < dimArr.length; i++) {
            dimArr[i] = new char[arr[i]];
            Arrays.fill(dimArr[i], ch[i]);
        }
        return dimArr;
    }

    public static void print2DArray(char[][] a) {
        System.out.print("{ {");
        for (int row = 0; row < a.length; row++) {
            for (int column = 0; column < a[row].length; column++) {
                System.out.print("'" + a[row][column] + "'");
                if (column < a[row].length - 1) {
                    System.out.print(", ");
                }
                if (row == a.length - 1 && column == a[row].length - 1) {
                    System.out.println("} };");
                    break;
                }
                if (column == a[row].length - 1) {
                    System.out.println(" },");
                    System.out.print("{ ");
                }
            }
        }
        System.out.println("");
    }

}
