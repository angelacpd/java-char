package corp.angela.interfaces;

public class Program {

    public static void main(String[] args) {

        final Gol gol = new Gol();
        System.out.println("Brand of Gol: " + gol.brand());
        gol.turnOn();

        final Vehicle tractor = new Tractor();
        System.out.println("Tractor register: " + tractor.register());
        tractor.turnOn();

        // It has to be Fiesta type because it breaks if it's not
        final Fiesta fiesta = new Fiesta();
        System.out.println("Brand of Fiesta: " + fiesta.brand());
        System.out.println("Fiesta register: " + fiesta.register());
        fiesta.turnOn();

    }
}
