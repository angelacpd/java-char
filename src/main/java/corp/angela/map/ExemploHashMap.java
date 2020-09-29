package corp.angela.map;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {

    public static void main(String[] args) {

        HashMap<String, Integer> campeoesMundialFifa = new HashMap<>();

        // Adiciona os campeos ao mapa
        campeoesMundialFifa.put("Brasil", 5);
        campeoesMundialFifa.put("Alemanha", 4);
        campeoesMundialFifa.put("Italia", 4);
        campeoesMundialFifa.put("Uruguai", 2);
        campeoesMundialFifa.put("Argentina", 2);
        campeoesMundialFifa.put("France", 2);
        campeoesMundialFifa.put("Inglaterra", 1);
        campeoesMundialFifa.put("Espanha", 1);

        // Note que ordem nao esta igual a ordem inserida
        System.out.println(campeoesMundialFifa);

        // Atualiza valor para a chave Brasil
        campeoesMundialFifa.put("Brasil", 6);

        System.out.println(campeoesMundialFifa);

        // REtorna a argentina
        System.out.println(campeoesMundialFifa.get("Argentina"));

        // Retorna se existe ou nao o campeao France
        System.out.println(campeoesMundialFifa.containsKey("France"));

        // Remove campeao France
        campeoesMundialFifa.remove("France");

        // Retorna se existe ou nao o campeao France
        System.out.println(campeoesMundialFifa.containsKey("France"));

        // retorna se existe hexacampeao
        System.out.println(campeoesMundialFifa.containsValue(6));

        // retorna tamanho do mapa
        System.out.println(campeoesMundialFifa.size());

        System.out.println(campeoesMundialFifa);

        // Navega nos registros do mapa
        for (Map.Entry<String, Integer> entry : campeoesMundialFifa.entrySet()) {
            System.out.println(entry.getKey() + " -- " + entry.getValue());
        }

        // Navega nos registros do maps
        for (String key: campeoesMundialFifa.keySet()) {
            System.out.println(key + " -- " + campeoesMundialFifa.get(key));
        }

        System.out.println(campeoesMundialFifa);

        // Verifica se o mapa contem a chave Estados Unidos
        System.out.println(campeoesMundialFifa.containsKey("Estados Unidos"));

        // Verifica se o mapa contem valor 5
        System.out.println(campeoesMundialFifa.containsValue(5));

        // Verifica o tamanho do map antes e depois de limpar
        System.out.println(campeoesMundialFifa.size());

        campeoesMundialFifa.clear();

        System.out.println(campeoesMundialFifa.size());

    }

}
