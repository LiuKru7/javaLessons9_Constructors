package example_1;

public class PhoneApp {

    public String name;
    public double version;
    public double size;

    public PhoneApp(String name, double version, double size) {
        this.name = name;
        this.version = version;
        this.size = size;
    }
    public void printInfo () {
        System.out.println("name : " + name);
        System.out.println("version :" + version);
        System.out.println("size : " + size);
    }
}
