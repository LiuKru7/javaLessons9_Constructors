package example_2;

public class DishWasherTester {
    public static void main(String[] args) {

        DishWasher siemens = new DishWasher();
        siemens.brand = "siemens 3000";
        siemens.capacity = 100;
        siemens.price = 1500;
        siemens.isUsed = true;
        siemens.haveDryFunction = false;

        DishWasher electrolux = new DishWasher("electrolux 2000", 100, true, true, 100);
        DishWasher samsung = new DishWasher("samsung 3000", 500, false, true, 50);

        System.out.println(siemens);
        System.out.println(electrolux);
        System.out.println(samsung);

        siemens.printPrice();
        siemens.printBrand();

    }

}
