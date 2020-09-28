package corp.angela.list;

import java.util.List;
import java.util.Vector;

public class ExemploVector {

    public static void main(String[] args) {

        List<String> esportes = new Vector<>();

        // Adiciona 4 esportes ao vetor
        esportes.add("Futebol");
        esportes.add("Basquetebol");
        esportes.add("Tenis de Mesa");
        esportes.add("Handebol");

        // Altera valor da posicao 2
        esportes.set(2, "Ping Pong");

        // Remove o esporte da posicao 2
        esportes.remove(2);

        // Remove handebol
        esportes.remove("Handebol");

        // Retorna o primeiro item
        System.out.println(esportes.get(0));

        // Navega nos esportes
        for (String esporte: esportes) {
            System.out.println(esporte);
        }

    }
}
