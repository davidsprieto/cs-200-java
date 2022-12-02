package WeekFifteen;

public class AirportTest {

    public static void main(String[] args) {
        Airport skyfly = new Airport();
        Airport ohare = new Airport("O'Hare", 54000000, 1);

        skyfly.displayAirport();
        ohare.displayAirport();
    }

}
