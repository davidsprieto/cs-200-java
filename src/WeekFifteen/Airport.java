package WeekFifteen;

public class Airport {

    private String name;
    private int capacity;
    private int rank;

    public Airport() {
        this.name = "Skyfly";
        this.capacity = 3;
        this.rank = 1;
    }

    public Airport(String name, int capacity, int rank) {
        this.name = name;
        this.capacity = capacity;
        this.rank = rank;
    }

    public void displayAirport() {
        System.out.println("Airport name: " + this.name);
        System.out.println("Capacity: " + this.capacity);
        System.out.println("Rank: " + this.rank + "\n");
    }

}
