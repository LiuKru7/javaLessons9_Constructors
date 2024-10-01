package home_work_example_2;

public class BankMain {
    public static void main(String[] args) {
        BankAccount jonas = new BankAccount("Jonas", "Kapitonas", 3200, 1234);
        System.out.println(jonas);
        jonas.deposit(2000, 123);
        jonas.deposit(2000, 123);
        jonas.deposit(2000, 1234);
        jonas.deposit(2000, 123);
        jonas.deposit(2000, 123);
        jonas.withdraw(20001, 1234);
        jonas.getBalance(1234);

    }





}
