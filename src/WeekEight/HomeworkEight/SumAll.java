// CS200
// Fall, 2022
// David Prieto
// Instructor: Y. Gutstein
// HW #2: Arrays + Methods
// Due: 10/21/2022
// SumAll.java

package WeekEight.HomeworkEight;

public class SumAll {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(sumAll(nums));

        int[] nums2 = {1, 2, 3, 1};
        System.out.println(sumAll(nums2));

        int[] nums3 = {1, 22};
        System.out.println(sumAll(nums3));
    }

    public static int sumAll(int[] nums) {
        int sum = 0;
        if (nums.length > 0) {
            for (int i = 0; i < nums.length; i++) {
                sum += nums[i];
            }
            return sum;
        }
        return -1;
    }

}
