// CS200
// Fall, 2022
// David Prieto
// Instructor: Y. Gutstein
// HW #5: Arrays + Methods
// Due: 10/21/2022
// BigDiff.java

package WeekEight.HomeworkEight;

public class BigDiff {

    public static void main(String[] args) {
        int[] nums = {10, 3, 5, 6};
        System.out.println(bigDiff(nums));

        int[] nums2 = {7, 2, 10};
        System.out.println(bigDiff(nums2));

        int[] nums3 = {11, 2, 9, 4, 1};
        System.out.println(bigDiff(nums3));
    }

    public static int bigDiff(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min)
                min = nums[i];
            if (nums[i] > max)
                max = nums[i];
        }
        return max - min;
    }

}
