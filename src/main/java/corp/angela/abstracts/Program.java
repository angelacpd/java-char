package corp.angela.abstracts;

public class Program {

    public static void main(String[] args) {

        //final FormaGeometrica formaGeometrica = new FormaGeometrica();

        final GeometricShape quadadro = new Square("quadadro", 10.0);

        System.out.println(quadadro);

        System.out.println(quadadro.desenha(12,34));
        System.out.println(quadadro.nome());
        System.out.println(quadadro.area());
    }

}
