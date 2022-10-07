package WeekSix.WorkshopSix;

public class Problem3 {

    public static void main(String[] args) {
        boolean b1 = allDigitsOdd(73925);
        System.out.println(b1);

        boolean b2 = allDigitsOdd(59175);
        System.out.println(b2);

        boolean b3 = allDigitsOdd(530);
        System.out.println(b3);

        boolean b4 = allDigitsOdd(31);
        System.out.println(b4);
    }

    public static boolean allDigitsOdd(int n) {
        int[] arr = Integer.toString(n).chars().map(a -> (a - '0')).toArray();

        for (int i = 0; i < arr.length; i ++) {
            if (arr[i] % 2 == 0) {
                return false;
            }
        }
        return true;
    }


}
