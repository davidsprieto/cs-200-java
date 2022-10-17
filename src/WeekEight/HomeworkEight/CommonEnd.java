// CS200
// Fall, 2022
// David Prieto
// Instructor: Y. Gutstein
// HW #3: Arrays + Methods
// Due: 10/21/2022
// CommonEnd.java

package WeekEight.HomeworkEight;

public class CommonEnd {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};

        int[] nums2 = {7, 3};
        System.out.println(commonEnd(nums, nums2));

        int[] nums3 = {7, 3, 2};
        System.out.println(commonEnd(nums, nums3));

        int[] nums4 = {1 ,3};
        System.out.println(commonEnd(nums, nums4));
    }

    public static boolean commonEnd(int[] a, int[] b) {
        return (a[0] == b[0] || a[a.length -1] == b[b.length - 1]);
    }

}
