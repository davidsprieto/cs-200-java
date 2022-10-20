package WeekNine;

public class MidtermReview {

    public static void main(String[] args) {
        int[] myArray = {20, 40, 15, 12, 7, 1, 56};
        System.out.println(sumOfOdds(myArray));
    }

    public static int sumOfOdds(int[] myArray) {
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 == 1)
                sum += myArray[i];
        }
        return sum;
    }

}
