package example_2;

public class DishWasher {

    public String brand;
    public int price;
    public boolean isUsed;
    public boolean haveDryFunction;
    public int capacity;

    public DishWasher() {
    }

    public DishWasher(String brand, int price, boolean isUsed, boolean haveDryFunction, int capacity) {
        this.brand = brand;
        this.price = price;
        this.isUsed = isUsed;
        this.haveDryFunction = haveDryFunction;
        this.capacity = capacity;
    }

    public void printBrand() {
        System.out.println("brand: " + brand);
    }

    public void printPrice() {
        System.out.println("Price: " + price);
    }

    @Override
    public String toString() {
        return "DishWasher{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", isUsed=" + isUsed +
                ", haveDryFunction=" + haveDryFunction +
                ", capacity=" + capacity +
                '}';
    }

}
