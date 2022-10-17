package LectureProblems;

public class Counts {
    public static void main(String[] args) {
        int size = 10;
        int[] nums = new int[size];

        //Fill array with random numbers
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * size);
        }

        //Print our array of random numbers
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);

            if (i < nums.length - 1)
                System.out.print(", ");
            else
                System.out.println();
        }

        int[] counts = countDigits(nums, size);

        //Print result of counts
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0) {
                System.out.println(i + ": " + counts[i] + " times");
            }
        }
    }

    public static int[] countDigits(int[] array, int size) {
        int[] counts = new int[size];

        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            counts[value]++;
        }

        return counts;
    }
}
