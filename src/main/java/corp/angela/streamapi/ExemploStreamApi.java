package corp.angela.streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploStreamApi {

    public static void main(String[] args) {

        // Cria a colecao de estudantes
        List<String> estudantes = new ArrayList<>();

        // Adiciona estudantes para a colecao
        estudantes.add("Pedro");
        estudantes.add("Thayse");
        estudantes.add("Marcelo");
        estudantes.add("Carla");
        estudantes.add("Juliana");
        estudantes.add("Thiago");
        estudantes.add("Rafael");

        // Retorna a contage de elementos do stream
        System.out.println("Contagem: " + estudantes.stream().count());

        // Retorna o elemento com o maior numero de letras
        System.out.println("Maior numero de letras: " + estudantes.stream().max(Comparator.comparingInt(String::length)));

        // Retorna o elemento com o menor numero de letras
        System.out.println("Maior numero de letras: " + estudantes.stream().min(Comparator.comparingInt(String::length)));

        // Retorna os elementos que tem a letra R no nome
        System.out.println("Com a letra R no nome: " + estudantes.stream().filter((estudante) ->
                estudante.toLowerCase().contains("r")).collect(Collectors.toList()));
        // Filter recebe uma regra (method reference / funcao lambda) que retorna true or false

        // Retorna uma nova colecao, com os nomes contaneados a quantidade de letra de cada nome
        System.out.println("Retorna uma nova colecao com a quantidade de letras: " + estudantes.stream().map(estudante ->
                estudante.concat(" - ").concat(String.valueOf(estudante.length()))).collect(Collectors.toList()));

        // Retorna somente os tres primeiros elementos da colecao
        System.out.println("Retorna os 3 primeiros elementos " + estudantes.stream().limit(3).collect(Collectors.toList()));

        // Exibe cada elemento no console e depois retorna a mesma coleca
        System.out.println("Retorna os elementos " + estudantes.stream().peek(System.out::println).collect(Collectors.toList()));

        // Exibe cada elemento no console sem retornar outra colecao
        System.out.println("Retorna elementos novamente: ");
        estudantes.stream().forEach(System.out::println);

        // Retorna true se todos os elementos tiverem a letra W no nome
        System.out.println("Todos os elementos tem W no nome?" + estudantes.stream().allMatch((elemento) -> elemento.contains("W")));

        // Retorna true se algum dos elementos possuem a letra minuscula no nome
        System.out.println("Tem algum elemento com minuscula no nome?" + estudantes.stream().anyMatch(elemento -> elemento.contains("a")));

        // Retorna true se algum dos elementos possuem a letra minuscula no nome
        System.out.println("Nao tem nenhum elemento com minuscula no nome?" + estudantes.stream().noneMatch(elemento -> elemento.contains("a")));

        // Retorna o primeiro elemento da colecao, se existir exibe no console
        System.out.println("Retorna o primeiro elemento da coleca: ");
        estudantes.stream().findFirst().ifPresent(System.out::println);

        // Exemplo de operacao encadeada
        System.out.print("Operacao encadeada: ");
        System.out.println(estudantes.stream()
                .peek(System.out::println)
                .map(estudante -> estudante.concat(" - ").concat(String.valueOf(estudante.length())))
                .peek(System.out::println)
                .filter((estudante) -> estudante.toLowerCase().contains("r"))
//                .collect(Collectors.toList()));
//                .collect(Collectors.joining(", ")));
//                .collect(Collectors.toSet()));
                .collect(Collectors.groupingBy(estudante -> estudante.substring(estudante.indexOf("-") + 1))));
        // a maioria das operacoes retornam um stream and eh possivel encadear uma apos a outra
        // peek - map - peek ocorrem de forma ~paralela~
    }

}
