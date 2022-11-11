package WeekEleven;

public class Demo {

    public static void main(String[] args) {
        ArrayDetails details = new ArrayDetails();

        int[] array1 = {1, 2, 3, 4, 5, 6};
        System.out.println("The maximum number in the array is: " + details.findMax(array1));

        int[] array2 = {20, 25, 30, 35};
        System.out.println("The average of the numbers in the array is: " + details.average(array2));

    }

}
