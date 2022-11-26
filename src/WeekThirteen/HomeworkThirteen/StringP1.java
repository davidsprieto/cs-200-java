// CS200
// Fall, 2022
// David Prieto
// Instructor: Y. Gutstein
// HW #1: Strings
// Due: 11/25/2022
// HomeworkThirteen.java

package WeekThirteen.HomeworkThirteen;

public class StringP1 {

    public static void main(String[] args) {
        boolean b1 = xyzPeriod("abcxyz");
        System.out.println(b1);
        boolean b2 = xyzPeriod("4abc.xyzygxyzop");
        System.out.println(b2);
        boolean b3 = xyzPeriod("xyz.yadda");
        System.out.println(b3);
        boolean b4 = xyzPeriod("st.uffxyz");
        System.out.println(b4);
        boolean b5 = xyzPeriod("xuyddz");
        System.out.println(b5);
    }

    public static boolean xyzPeriod(String str) {
        if (str.indexOf(".xyz") != -1) {
            return false;
        } else return str.indexOf("xyz") != -1;
    }

}
