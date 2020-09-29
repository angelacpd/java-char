package corp.angela.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExemploLinkedHashSet {

    public static void main(String[] args) {

        LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();

        // adiciona os numeros ao set
        sequenciaNumerica.add(16);
        sequenciaNumerica.add(1);
        sequenciaNumerica.add(8);
        sequenciaNumerica.add(2);
        sequenciaNumerica.add(4);

        // Note que esta na ordem inserida
        System.out.println(sequenciaNumerica);

        // remove o numero do set
        sequenciaNumerica.remove(4);

        System.out.println(sequenciaNumerica);

        // retorna quantidade de itens
        System.out.println(sequenciaNumerica.size());

        // navega em todos os itens do iterator
        Iterator<Integer> iterator = sequenciaNumerica.iterator();

        while (iterator.hasNext()) {
            System.out.println("iterator" + iterator.next());
        }

        for (Integer numero: sequenciaNumerica) {
            System.out.println("for loop: " + numero);
        }

        sequenciaNumerica.clear();

        // Retorna se o set esta vazio
        System.out.println("Is empty? " + sequenciaNumerica.isEmpty());

    }
}
