package WeekFifteen;

public class Problem4 {

    public static void main(String[] args) {
        int[] a1 = {2, 5, 37, 103, 94, 71, 67, 99, 43, 21};
        int[][] arr1 = change2D(a1);
        print2DArray(arr1);

        int[] b1 = {3, 2, 6, 7};
        int[][] arr2 = change2D(b1);
        print2DArray(arr2);
    }

    public static int[][] change2D(int[] inputArr) {
        double total = 0;
        int[][] dimArr = new int[2][];
        for (int j : inputArr) {
            if (j % 2 != 0) {
                total++;
            }
        }
        dimArr[0] = new int[(int) (Math.round(total / 2) + 0.5)];
        total /= 2;
        dimArr[1] = new int[(int) total];

        int ind = 1, index = 0;
        for (int i = 0; i < inputArr.length; i++, ind++) {
            if (inputArr[i] % 2 != 0) {
                dimArr[0][index] = inputArr[i];
                index++;
                if (index == dimArr[0].length) {
                    break;
                }
            }
        }
        index = 0;
        for (int i = ind; i < inputArr.length; i++) {
            if (inputArr[i] % 2 != 0 && index < dimArr[1].length) {
                dimArr[1][index] = inputArr[i];
                index++;
            }
        }
        return dimArr;
    }

    public static void print2DArray(int[][] a) {
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
