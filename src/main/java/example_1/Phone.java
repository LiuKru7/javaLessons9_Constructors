package example_1;

public class Phone {
    public String brand;
    public int price;
    public boolean isUsed;

    public Phone(int price, String brand, boolean isUsed) {
        this.price = price;
        this.brand = brand;
        this.isUsed = isUsed;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", isUsed=" + isUsed +
                '}';
    }

    public void printBrandName(){
        System.out.println("Phone brand is: " + brand);
    }

}
