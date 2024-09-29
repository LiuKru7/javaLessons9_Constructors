package example_3;

public class BusPark {
    public static void main(String[] args) {
        Person jonas = new Person ("Jonas");
        Bus schoolBus = new Bus("Scania", 60 , jonas);
        System.out.println(schoolBus);

    }
}
