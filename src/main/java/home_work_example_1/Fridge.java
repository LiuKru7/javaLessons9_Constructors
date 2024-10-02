package home_work_example_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




public class Fridge {

    final private Scanner scanner = new Scanner(System.in);

    public String brand;
    public String model;
    public int price;
    public int capacity;
    public double freezerTemp = -4;
    public double fridgeTemp = 2;
    public List<Products> products = new ArrayList<>();
    public boolean fridgeIsOpen = false;

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
                "MIN_FRIDGE_TEMP=" + MIN_FRIDGE_TEMP +
                ", model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", capacity=" + capacity +
                ", fridgeTemp=" + fridgeTemp +
                ", freezerTemp=" + freezerTemp +
                ", product=" + products +
                ", MAX_FRIDGE_TEMP=" + MAX_FRIDGE_TEMP +
                ", MIN_FREEZER_TEMP=" + MIN_FREEZER_TEMP +
                ", MAX_FREEZER_TEMP=" + MAX_FREEZER_TEMP +
                '}';
    }

    public void increaseFridgeTemp(double temp) {
        System.out.printf("\nYou want to increase fridge temperature %s \n", temp);
        if (temp < 0) {
            System.out.println("It must be a positive number.");
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
            return;
        }
        freezerTemp -= temp;
        if (freezerTemp > MIN_FREEZER_TEMP) {
            freezerTemp = MIN_FREEZER_TEMP;
        }
        System.out.println("You have decrease the freezer temperature to: " + freezerTemp + "\n");

    }

    public void defrostFreezer() {
        double currentTemp = this.freezerTemp;
        System.out.println("The defrost function is currently active.");
        this.freezerTemp = 0;
        System.out.println("Defrosting is complete.");
        this.freezerTemp = currentTemp;

    }
    public void openFridge () {
        if (fridgeIsOpen) {
            fridgeIsOpen = false;
            System.out.println("You close the fridge");
        } else {
            fridgeIsOpen = true;
            System.out.println("You open the fridge");
        }
    }

    public void addProductFridge() {
        while (fridgeIsOpen) {
            System.out.println("C- Close, A-Add product R- remove: \n");
            String input = scanner.nextLine();


            if (input.equalsIgnoreCase("c")) {
                System.out.println("Fridge is close");
                fridgeIsOpen = false;
                return;
            }

            if (input.equalsIgnoreCase("a")) {
                addProduct();
            }
            if (input.equalsIgnoreCase("r")){
                removeProduct();
            }
        }
    }

    private void removeProduct() {
        System.out.println("Tell what you want to remove from fridge");
        String productName = scanner.nextLine();
        products.removeIf(products -> products.name.equalsIgnoreCase(productName));
    }

    private void addProduct() {
        System.out.println("Tell what you add to fridge: \n");
        String productName = scanner.nextLine();
        System.out.println("Tell quantity\n");
        int productQuantity = Integer.parseInt(scanner.nextLine());
        Products product = new Products(productName, productQuantity);
        products.add(product);
        System.out.println("You added " +  productName + " to the fridge.");
    }
}
