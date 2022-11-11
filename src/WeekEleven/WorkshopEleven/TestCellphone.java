package WeekEleven.WorkshopEleven;

import java.util.ArrayList;
import java.util.Scanner;

public class TestCellphone {

    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        System.out.print("What is your budget? ");
        double budget = kbd.nextDouble();

        System.out.print("What is your desired memory space? ");
        int memory = kbd.nextInt();

        comparingPhones(budget, memory);
    }

    public static void comparingPhones(double budget, int memory) {
        Cellphone samsung = new Cellphone("Samsung", "Galaxy S8", 480.0, 32);
        Cellphone apple = new Cellphone("Apple", "iPhone X", 1000.0, 126);
        Cellphone huawei = new Cellphone("Huawei", "Mate 10 Pro", 639.0, 64);
        Cellphone lg = new Cellphone("LG", "G7 ThinQ", 750.0, 64);
        Cellphone google = new Cellphone("Google", "Pixel", 315.0, 32);
        Cellphone asus = new Cellphone("Asus", "ZenFone Zoom", 800.0, 126);

        ArrayList<Cellphone> phones = new ArrayList<>();
        phones.add(samsung);
        phones.add(apple);
        phones.add(huawei);
        phones.add(lg);
        phones.add(google);
        phones.add(asus);

        boolean print = false;
        for (Cellphone phone : phones) {
            boolean match = budget >= phone.getPrice() && memory == phone.getMemory();
            if (match) {
                print = true;
                break;
            }
        }

        if (print) {
            System.out.println("\nI would recommend the following phones: ");
            System.out.println();
        } else {
            System.out.println("\nI cannot recommend any phones based on your criteria.");
        }

        for (Cellphone phone : phones) {
            boolean match = budget >= phone.getPrice() && memory == phone.getMemory();
            if (match) {
                System.out.println(phone.getBrand() + " " + phone.getName());
                System.out.println("$" + phone.getPrice());
                System.out.println(phone.getMemory() + " GB Memory");
                System.out.println("You will save $" + (int) (budget - phone.getPrice()) + " buying this phone.");
                System.out.println(" ");
            }
        }
    }

}
