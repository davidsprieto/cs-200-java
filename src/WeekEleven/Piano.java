package WeekEleven;

public class Piano {
    private int c;
    private String d;

    public Piano(int c, String d) {
        System.out.println(this.c + " " + this.d);
        this.c += c;
        this.d = d;
    }

    public Piano() {
        this.c = 2;
        this.d = "piano";
        System.out.println(this.c + " " + this.d);
    }

    public void key() {
        System.out.println(this.c);
    }

    public void key(int a) {
        this.c = a;
        System.out.println("key2");
    }
}
