package corp.angela.interfaces;

public class Gol implements Car {
    // Gol inherits the method brand()
    @Override
    public String brand() {
        return "Volkswagen";
    }

    @Override
    public Double value() {
        return null;
    }
}
