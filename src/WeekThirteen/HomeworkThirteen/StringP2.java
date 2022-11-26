// CS200
// Fall, 2022
// David Prieto
// Instructor: Y. Gutstein
// HW #2: Strings
// Due: 11/25/2022
// HomeworkThirteen.java

package WeekThirteen.HomeworkThirteen;

import java.math.BigInteger;

public class StringP2 {

    public static void main(String[] args) {
        productOfDigits("tfg113f8f2okil");
        productOfDigits("h4739jf938473jfj983jfjoirui49484949848393d");
        productOfDigits("hdhgheielsldh");
        productOfDigits("dj37hg0kr7");
    }

    public static void productOfDigits(String str) {
        BigInteger r = null;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                BigInteger result = new BigInteger(str.charAt(i) + "");
                if (r != null) {
                    r = r.multiply(result);
                } else {
                    r = result;
                }
            }
        }

        if (r == null) {
            System.out.print("No digits\n");
        } else {
            System.out.print("Product: " + r + "\n");
        }
    }

}
