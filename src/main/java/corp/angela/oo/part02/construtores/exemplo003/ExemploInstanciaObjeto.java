package corp.angela.oo.part02.construtores.exemplo003;

public class ExemploInstanciaObjeto {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Marco");

        System.out.println(pessoa.getNome());

        Carro fofo = new Carro("Ford", "Ka", 2020);

        System.out.println(fofo.getMarca());

    }

}
