package corp.angela.optionals;

import java.util.Optional;

public class ExemploOptionalEstados {

    public static void main(String[] args) {

        Optional<String> optionalString = Optional.of("Valor presente");
        System.out.println("Valor opcional que esta presente");
        optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("Nao esta presente"));
        // System.out::println -> funcao lambda que deve ser executada se o estado do optional for presente
        // poderia ser substituido (valor) -> System.out.println(valor)

        Optional<String> optionalNull = Optional.ofNullable(null);
        // se o valor for nulo, retorna um optional vazio, nao presente e se o valor nao for nulo vai retornar um
        // optional com aquele valor
        System.out.println("Valor optional que nao esta presente");
        optionalNull.ifPresentOrElse(System.out::println, () -> System.out.println("null = nao esta presente"));

        Optional<String> optionalEmpty = Optional.empty();
        System.out.println("Valor optional qu enao esta presente");
        optionalEmpty.ifPresentOrElse(System.out::println, () -> System.out.println("empty = nao esta presente"));

        Optional<String> optionalNullError = Optional.of(null);
        System.out.println("Valor opcional que lanca erro NullPointerException");
        optionalNullError.ifPresentOrElse(System.out::println, () -> System.out.println("Erro = nao esta presente"));

    }

}
