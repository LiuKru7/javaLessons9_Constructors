package example_1;

public class Phone {

    public String brand;
    public int price;
    public boolean isUsed;
    private int pinCode = 1111;
    public boolean isLocked = true;
    public PhoneApp application;

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

    public void call(String phoneNumber, String personName){
        if(this.isLocked){
            System.out.println("Phone is locked");
            return;
        }
        System.out.printf("Calling %s using phone number %s", phoneNumber,personName);
    }
    public void unlock (int pinCode){
        if (this.pinCode == pinCode) {
            System.out.println("Phone is UNLOCKED!");
            isLocked=false;
        }
    }
    public void sendMessage (String message, String phoneNumber){
        if (this.isLocked) {
            System.out.println("Phone is locked");
            return;
        }
        System.out.printf("""
                Message Content: %s
                Sent to: %s
                """, message, phoneNumber);

    }
    public void downloadApp (String appName, double version){
        this.application = new PhoneApp(appName, version,20);
        System.out.println("Application was downloaded: ");
        application.printInfo();

    }




}
