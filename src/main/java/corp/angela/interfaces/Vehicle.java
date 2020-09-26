package corp.angela.interfaces;

public interface Vehicle {

    String register();

    default void turnOn() {
        System.out.println("Turn-on vehicle");
    }

    // void turnOff();

    /*
    default void turnOff() {
        System.out.println("Turn-off vehicle.")
    }
     */

}
