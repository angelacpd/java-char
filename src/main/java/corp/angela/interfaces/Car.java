package corp.angela.interfaces;

public interface Car {
    // It's not required to add the modifier 'public'
    // public String brand();
    String brand();

    // Create new method breaks the inherited classes.
    Double value();

    default void turnOn() {
        System.out.println("Turn on car.");
    }

    // Method default does not break implementation
    default String codeChassis() {
        return "3194398jf";
    }
}
