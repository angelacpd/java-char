package corp.angela.queue;

import java.util.LinkedList;
import java.util.Queue;

public class ExemploLinkedList {

    public static void main(String[] args) {

        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Patricia");
        filaBanco.add("Roberto");
        filaBanco.add("Flavio");
        filaBanco.add("Pamela");
        filaBanco.add("Anderson");

        System.out.println(filaBanco);

        // Le e remove primeiro elemento da fila
        String clienteASerAtendido = filaBanco.poll();

        System.out.println(clienteASerAtendido);

        System.out.println(filaBanco);

        filaBanco.clear();

        // Consulta quem eh o primeiro da fila e retorna null se a fila for vazia
        String primeiroCliente = filaBanco.peek();

        System.out.println(primeiroCliente);

        System.out.println(filaBanco);


        System.out.println(filaBanco);

        String primeiroClienteOuErro = filaBanco.element();

//        try {
//            // Consulta primeiro elemento e retorna erro se a fila for vazia
//        String primeiroClienteOuErro = filaBanco.element();
//        } catch (NoSuchElementException e) {
//            System.out.println("Fila vazia.");
//        } // finally {
////
////        }
//
        System.out.println(primeiroClienteOuErro);

        System.out.println(filaBanco);

        for (String client: filaBanco) {
            System.out.println(client);
        }
		
		Iterator<String> iteratorFilaBanco =filaBanco.iterator();
		
		while (iteratorFilaBanco.hasNext()) {
			System.out.println("-->"+ iteratorFilaBanco.next());
		}
		
		System.out.println(filaBanco.size());
		
		filaBanco.clear();
		
		System.out.println(filaBanco.isEmpty());
		
		filaBanco.add("Wesley");
		
		System.out.println(filaBanco);

    }

}
