package home_work_example_1;

import java.util.Scanner;


public class Fridge {
    public String brand;
    public String model;
    public int price;
    public int capacity;
    public double freezerTemp = -4;
    public double fridgeTemp = 2;
    public Products product;

    final public double MIN_FRIDGE_TEMP = 2;
    final public double MAX_FRIDGE_TEMP = 10;
    final public double MIN_FREEZER_TEMP = -4;
    final public double MAX_FREEZER_TEMP = -20;

    public Fridge(String brand, String model, int price, int capacity) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Fridge{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price='" + price + '\'' +
                ", capacity=" + capacity +
                ", MIN_FRIDGE_TEMP=" + MIN_FRIDGE_TEMP +
                ", MAX_FRIDGE_TEMP=" + MAX_FRIDGE_TEMP +
                ", MIN_FREEZER_TEMP=" + MIN_FREEZER_TEMP +
                ", MAX_FREEZER_TEMP=" + MAX_FREEZER_TEMP +
                '}';
    }

    public void increaseFridgeTemp(double temp) {
        System.out.printf("\nYou want to increase fridge temperature %s \n", temp);
        if (temp < 0) {
            System.out.println("It must be a positive number.");
            ;
            return;
        }
        fridgeTemp += temp;
        if (fridgeTemp > MAX_FRIDGE_TEMP) {
            fridgeTemp = MAX_FRIDGE_TEMP;
        }
        System.out.println("You have increased the fridge temperature to: " + fridgeTemp);
    }

    public void decreaseFridgeTemp(double temp) {
        System.out.printf("\nYou want to decrease fridge temperature %s \n", temp);
        if (temp < 0) {
            System.out.println("It must be a positive number.");
            ;
            return;
        }
        fridgeTemp -= temp;
        if (fridgeTemp < MIN_FRIDGE_TEMP) {
            fridgeTemp = MIN_FRIDGE_TEMP;
        }
        System.out.println("You have decrease the fridge temperature to: " + fridgeTemp);

    }

    public void increaseFreezerTemp(double temp) {
        System.out.printf("\nYou want to increase freezer temperature %s \n", temp);
        if (temp < 0) {
            System.out.println("It must be a positive number.");
            ;
            return;
        }
        freezerTemp += temp;
        if (freezerTemp > MAX_FREEZER_TEMP) {
            freezerTemp = MAX_FREEZER_TEMP;
        }
        System.out.println("You have increased the freezer temperature to: " + freezerTemp + "\n");

    }

    public void decreaseFreezerTemp(double temp) {
        System.out.printf("\nYou want to decrease freezer temperature %s \n", temp);
        if (temp < 0) {
            System.out.println("It must be a positive number.");
            ;
            return;
        }
        freezerTemp -= temp;
        if (freezerTemp > MIN_FREEZER_TEMP) {
            freezerTemp = MIN_FREEZER_TEMP;
        }
        System.out.println("You have decrease the freezer temperature to: " + freezerTemp + "\n");

    }

    public void defrostFreezer() {
        double desiredTemp = freezerTemp;
        System.out.println("The defrost function is currently active.");
        freezerTemp = 0;
        System.out.println("Defrosting is complete.");
        freezerTemp = desiredTemp;

    }

    public void addProductFridge() {
        boolean fridgeIsOpen = true;
        while (fridgeIsOpen) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("C- Close, A-Add product: \n");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("c")) {
                System.out.println("Fridge is close");
                fridgeIsOpen = false;
                return;
            }
            if (input.equalsIgnoreCase("a")) {
                System.out.println("Tell what you take to fridge: \n");
                String productName = scanner.nextLine();
                System.out.println("Tell quantity\n");
                int productQuantity = Integer.parseInt(scanner.nextLine());
                product = new Products(productName, productQuantity);
                System.out.println("You add " + product.name + " to fridge.");
            }
        }
    }


}
