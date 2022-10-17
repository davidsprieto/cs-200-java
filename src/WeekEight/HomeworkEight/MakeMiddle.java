// CS200
// Fall, 2022
// David Prieto
// Instructor: Y. Gutstein
// HW #4: Arrays + Methods
// Due: 10/21/2022
// MakeMiddle.java

package WeekEight.HomeworkEight;

public class MakeMiddle {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] valueOfNums = makeMiddle(nums);
        printArray(valueOfNums);

        int[] nums2 = {7, 1, 3, 2, 4, 9};
        int[] valueOfNums2 = makeMiddle(nums2);
        printArray(valueOfNums2);

        int[] nums3 = {1, 2};
        int[] valueOfNums3 = makeMiddle(nums3);
        printArray(valueOfNums3);
    }

    public static int[] makeMiddle(int[] nums) {
        int[] evenMiddle = new int[2];
        int[] oddMiddle = new int[1];
        if (nums.length >= 2) {
            if (nums.length % 2 == 0) {
                evenMiddle[0] = nums[nums.length / 2 - 1];
                evenMiddle[1] = nums[nums.length / 2];
                return evenMiddle;
            } else {
                oddMiddle[0] = nums[(nums.length / 2)];
                return oddMiddle;
            }
        }
        return nums;
    }

    public static void printArray(int[] array) {
        System.out.print("{");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("}");
    }

}
