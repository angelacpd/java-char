package corp.angela.enums;

public class Program {

    public static void main(String[] args) {
        // final VehicleType = new VehicleType();
        System.out.println(VehicleType.LAND);
        System.out.println(VehicleType.AQUATIC);

        System.out.println(VehicleType.valueOf("AERIAL"));

        for (VehicleType type : VehicleType.values()) {
            System.out.println("Type: " + type);
        }

        System.out.println("Status code CLOSE: " + Status.CLOSE);
        System.out.println("Status code OPEN: " + Status.OPEN);
    }
}
