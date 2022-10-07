package WeekSix.WorkshopSix;

public class Problem1 {

    public static void main(String[] args) {
        int heads = 0, tails = 0;
        double flip;

        for (int i = 0; i <= 1000000; i++) {
            flip = Math.round(Math.random());
            if (flip == 0) {
                heads++;
            } else if (flip == 1) {
                tails++;
            }
        }
        System.out.println("Heads: " + heads);
        System.out.println("Tails: " + tails);
        System.out.println(heads + " Heads + " + tails + " Tails is 1000000 flips.");
    }

}
