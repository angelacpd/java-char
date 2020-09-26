package corp.angela.statics;

public class Program {

    public static void main(String[] args) {
        final Dog pitbull = new Dog();
        pitbull.zoologia = "Bipede";

        final Dog viraLatas = new Dog();

        System.out.println(pitbull.zoologia);
        System.out.println(viraLatas.zoologia);

        Dog.late();
    }
}
