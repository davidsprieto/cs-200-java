package LectureProblems;

public class SumValues2DArray {
    public static void main(String[] args) {
        int[][] nums = {{1, 3},
                {13, 7, 15},
                {12}
        };

        int[] sums = sumColumns(nums);

        for (int i = 0; i < sums.length; i++) {
            System.out.println("Row # " + i + ": " + sums[i]);
        }
    }

    public static int[] sumColumns(int[][] arr) {
        int[] sums = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sums[i] += arr[i][j];
            }
        }
        return sums;
    }
}
