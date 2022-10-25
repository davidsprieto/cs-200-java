package LectureProblems;

public class LargestValue2DArray {
    public static void main(String[] args) {
        int[][] nums = {{1, 3},
                {13, 7},
                {12, 2}
        };

        int[] largest = locateLargest(nums);
        int row = largest[0];
        int col = largest[1];

        System.out.println("The largest value in nums is: "
                + nums[row][col] + ",\nwhich is row #"
                + row + " and column #" + col);
    }

    public static int[] locateLargest(int[][] arr) {
        int[] loc = {0, 0};
        int maxValue = arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > maxValue) {
                    maxValue = arr[i][j];
                    loc[0] = i;
                    loc[1] = j;
                }
            }
        }
        return loc;
    }
}
