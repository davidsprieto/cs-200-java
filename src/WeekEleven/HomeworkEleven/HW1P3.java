package WeekEleven.HomeworkEleven;

public class HW1P3 {
    public static void main(String[] args) {
        Piano p1 = new Piano();
        Piano p2 = new Piano(4, "Baldwin");
        p1.key();
        p2.key();
        p2 = p1;
        p2.key();
        p2.key(-5);
        p1.key();
    }
}
