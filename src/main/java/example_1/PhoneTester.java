package example_1;

public class PhoneTester {

    public static void main(String[] args) {

        Phone iphone = new Phone(999, "iphone 16", false);
        Phone samsung = new Phone(1099, "samsung s24", false);
        Phone nokia = new Phone(9999, "nokia n70", true);

        System.out.println(iphone);
        System.out.println(nokia);
        System.out.println(samsung);

    }
}
