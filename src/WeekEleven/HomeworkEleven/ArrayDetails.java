// CS200
// Fall, 2022
// David Prieto
// Instructor: Y. Gutstein
// HW #1: Objects and Classes
// Due: 11/11/2022
// ArrayDetails.java

package WeekEleven.HomeworkEleven;

public class ArrayDetails {

    public ArrayDetails() {}

    public int findMax(int[] array) {
        int largest = array[0];

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] > array[i]) {
                largest = array[i + 1];
            }
        }
        return largest;
    }

    public double average(int[] array) {
        double sum = 0;
        double length = array.length;

        for (int i = 1; i < length; i++) {
            sum += array[i];
        }
        return (sum / length);
    }

}
