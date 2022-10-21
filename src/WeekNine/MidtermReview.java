package WeekNine;

public class MidtermReview {

    public static void main(String[] args) {
        int[] myArray = {20, 40, 15, 12, 7, 1, 56};
        System.out.println(sumOfOdds(myArray));

        int[] myArray1 = {3, 8, 17, 25, 89, 94};
        System.out.println(goingWhichWay(myArray1));

        int[] myArray2 = {77, 66, 55, 33, 22, 11};
        System.out.println(goingWhichWay(myArray2));

        int[] myArray3 = {20, 30, 50, 40, 10, 5};
        System.out.println(goingWhichWay(myArray3));

        int[] myArray4 = {20, 30, 50, 50, 70, 90};
        System.out.println(goingWhichWay(myArray4));
    }

    public static int sumOfOdds(int[] myArray) {
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 == 1)
                sum += myArray[i];
        }
        return sum;
    }

    public static int goingWhichWay(int[] myArray) {
        boolean increasing = false;
        boolean decreasing = false;

        for (int i = 1; i < myArray.length; i++) {
            for (int j = 0; j < i; j++) {
                if (myArray[i] > myArray[j]) {
                    increasing = true;
                }
                if (myArray[i] < myArray[j]) {
                    decreasing = true;
                }
                if (increasing && myArray[i] <= myArray[j]) {
                    System.out.println("NEITHER");
                    return 333;
                }
                if (decreasing && myArray[i] >= myArray[j]) {
                    System.out.println("NEITHER");
                    return 333;
                }
            }
        }
        if (increasing) {
            System.out.println("INCREASING");
            return 111;
        } else {
            System.out.println("DECREASING");
            return 222;
        }
    }

}
