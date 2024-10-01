package home_work_example_2;

public class BankAccount {
    public String accountNumber = "LT" + (int) (Math.random() * 10000000);
    public String accountHolderName;
    public String accountHolderSurname;
    public double balance;
    private final int pinCode;
    public int chancePinCode = 3;
    final public static int MAX_MONEY_AMOUNT = 10000;


    public BankAccount(String accountHolderName, String accountHolderSurname, double balance, int pinCode) {
        this.accountHolderName = accountHolderName;
        this.accountHolderSurname = accountHolderSurname;
        this.balance = balance;
        this.pinCode = pinCode;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountHolderName='" + accountHolderName + '\'' +
                ", accountHolderSurname='" + accountHolderSurname + '\'' +
                ", balance=" + balance +
                '}';
    }

    public void deposit (double amount, int pinCode) {
        if (checkCardBlocked()) return;
        if (checkPinCode(pinCode)) return;
        if (checkAmount(amount)) return;
        balance += amount;
        System.out.println("You have deposited " + amount + " euros into the bank account.");
    }


    public void withdraw (double amount, int pinCode) {
        if (checkCardBlocked()) return;
        if (checkPinCode(pinCode)) return;
        if (checkAmount(amount)) return;
        if (balance>amount) {
            balance-=amount;
            System.out.println("Take the money.");
        } else {
            System.out.println("You do not have enough funds in your bank account for this transaction.");
        }
    }
    public void getBalance (int pinCode) {
        if (checkCardBlocked()) return;
        if (checkPinCode(pinCode)) return;
        System.out.println("You have "+ balance +" euros in your account.");

    }

    private static boolean checkAmount(double amount) {
        if(amount <0) {
            System.out.println("The amount of money cannot be negative.");
            return true;
        }
        if (amount> MAX_MONEY_AMOUNT)
            System.out.println("The amount of money cannot be more than " + MAX_MONEY_AMOUNT + " euros");

        return false;
    }

    private boolean checkPinCode(int pinCode) {
        if(this.pinCode != pinCode) {
            chancePinCode -= 1;
            System.out.println("Incorrect PIN code, you have " + chancePinCode +  " attempts remaining." );
            return true;
        }
        chancePinCode = 3;
        return false;
    }

    private boolean checkCardBlocked() {
        if(chancePinCode == 0){
            System.out.println("Your card is blocked");
            return true;
        }
        return false;
    }

}
