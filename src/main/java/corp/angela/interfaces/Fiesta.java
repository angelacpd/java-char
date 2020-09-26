package corp.angela.interfaces;

public class Fiesta implements Car, Vehicle {   // Multiple Inheritance
    @Override
    public String brand() {
        return "Ford";
    }

    @Override
    public Double value() {
        return null;
    }

    @Override
    public String register() {
        return "TGH134354";
    }

    @Override
    public void turnOn() {
        Car.super.turnOn();
        Vehicle.super.turnOn();
    }
}
