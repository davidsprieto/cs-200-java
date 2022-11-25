package WeekThirteen.WorkshopThirteen;

public class Decimals {

    private Decimals() {}

    private static void printDecimalDigits(Double number) {
        Integer sum = 0;
        String num = String.valueOf(number);
        Integer index = num.indexOf(".") + 1;
        System.out.println("Digits after decimal point: ");
        for (Integer i = index; i < num.length(); i++) {
            Character d = num.charAt(i);
            System.out.print(d + " ");
            sum += Integer.parseInt(String.valueOf(d));
        }
        System.out.println();
        System.out.println("Sum: " + sum);
    }

    public static void main(String[] args) {
        Decimals.printDecimalDigits(37.25);
        Decimals.printDecimalDigits(1000d);
        Decimals.printDecimalDigits(18.3927493038);
    }

}
