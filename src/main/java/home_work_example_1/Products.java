package home_work_example_1;

public class Products {
    String name;
    int quantity;

    public Products(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Products{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
