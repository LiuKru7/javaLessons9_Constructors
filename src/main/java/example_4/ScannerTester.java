package example_4;

import java.util.Scanner;

public class ScannerTester {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter product price: ");
        int price = scanner.nextInt();
        System.out.println("Product price is: "+ price);

        System.out.println(" Please enter product weight : ");
        double weight = scanner.nextDouble();
        System.out.println("Product weight is: " + weight );

        System.out.println("Please enter product name: ");
        String name = scanner.nextLine();
        System.out.println("Name : "+ name);




    }
}
