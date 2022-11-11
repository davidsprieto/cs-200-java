package WeekEleven.WorkshopEleven;

public class Cellphone {
    private String brand;
    private String name;
    private double price;
    private int memory;

    public Cellphone(String brand, String name, double price, int memory) {
        this.brand = brand;
        this.name = name;
        this.price = price;
        this.memory = memory;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public int getMemory() {
        return this.memory;
    }
}
