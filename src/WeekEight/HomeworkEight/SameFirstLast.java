// CS200
// Fall, 2022
// David Prieto
// Instructor: Y. Gutstein
// HW #1: Arrays + Methods
// Due: 10/21/2022
// SameFirstLast.java

package WeekEight.HomeworkEight;

public class SameFirstLast {

    public static void main(String[] args) {
        int [] nums = {1, 2, 3};
        System.out.println(sameFirstLast(nums));

        int [] nums2 = {1, 2, 3, 1};
        System.out.println(sameFirstLast(nums2));

        int[] nums3 = {1, 2, 1};
        System.out.println(sameFirstLast(nums3));
    }

    public static boolean sameFirstLast(int[] nums) {
         return (nums.length > 1 && nums[0] == nums[nums.length - 1]);
    }

}
