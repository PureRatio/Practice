package EleventhDay;

public class Main {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Picker picker = new Picker(warehouse);
        Courier courier = new Courier(warehouse);

        for (int i = 0; i < 1500; i++){
            picker.doWork();
            picker.bonus();

            courier.doWork();
            courier.bonus();
        }
        System.out.println(warehouse + " " + picker + " " + courier);

        Warehouse warehouse2 = new Warehouse();
        Picker picker2 = new Picker(warehouse2);
        Courier courier2 = new Courier(warehouse2);

        picker2.doWork();
        picker2.bonus();

        courier2.doWork();
        courier2.bonus();
        System.out.println(warehouse2 + " " + picker2 + " " + courier2);
        System.out.println(warehouse + " " + picker + " " + courier);
    }
}
