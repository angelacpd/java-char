package corp.angela.oo.part01.paradigma.exemplo001;

import corp.angela.interfaces.Car;

public class ExemploMetodos {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Carro fusca = new Carro();

        System.out.println(fusca.entraPessoas(3));
        System.out.println(fusca.entraPessoas(2));
        System.out.println(fusca.saiPessoas(1));
        System.out.println(fusca.saiPessoas(4));

        System.out.println(pessoa.falarMeuProprioNome());
        // Olá, meu nome é Marco

        System.out.println(pessoa.andar());
    }
}
