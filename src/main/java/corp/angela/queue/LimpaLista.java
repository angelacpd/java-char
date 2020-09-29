package corp.angela.queue;

import java.util.LinkedList;
import java.util.Queue;

public class LimpaLista {

    public static void main(String []args) {


        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Patricia");
        filaBanco.add("Roberto");
        filaBanco.add("Flavio");
        filaBanco.add("Pamela");
        filaBanco.add("Anderson");

        filaBanco.clear();

        String primeiroClienteOuErro = filaBanco.element();

        System.out.println(primeiroClienteOuErro);

    }
}
