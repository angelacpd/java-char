package corp.angela.abstracts;

public abstract class GeometricShape {

    public abstract String nome();
    public abstract Double area();

    public String desenha(int x , int y) {
        return "Desenhando nas coordenadas X="+x+" Y:"+y;
    }

}
