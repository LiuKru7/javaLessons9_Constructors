package home_work_example_1;

public class FridgeMain {
    public static void main(String[] args) {
        Fridge electrolux = new Fridge("Electrolux","S2045", 399, 2000);
        System.out.println(electrolux);

        Fridge siemens = new Fridge("Siemens", "HR2003", 239,  1500);
        System.out.println(siemens);

        siemens.decreaseFreezerTemp(2);
        siemens.increaseFridgeTemp(3);
        siemens.defrostFreezer();
        siemens.increaseFreezerTemp(4);
        siemens.decreaseFridgeTemp(4);

        siemens.addProductFridge();






    }
}
