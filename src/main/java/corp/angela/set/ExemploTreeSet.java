package corp.angela.set;

import java.util.TreeSet;

public class ExemploTreeSet {

    public static void main(String[] args) {

        TreeSet<String> treeCapitais = new TreeSet<>();

        // Monta a arvore com as capitais
        treeCapitais.add("POA");
        treeCapitais.add("Floripa");
        treeCapitais.add("CWB");
        treeCapitais.add("SP");
        treeCapitais.add("RJ");
        treeCapitais.add("BH");

        System.out.println(treeCapitais);

        // Retorna a primeira capital no topo da arvore
        System.out.println("first" + treeCapitais.first());

        // Retorna a ultima capital no final da arvore
        System.out.println("last " + treeCapitais.last());

        // Retorna a primeira capital abaixo da capital parametrizada
        System.out.println("lower" + treeCapitais.lower("Floripa"));

        // Retorna a primeira capital acima da capital parametrizada
        System.out.println("higher" + treeCapitais.higher("Floripa"));

        // Exibe todas as capitais no console
        System.out.println(treeCapitais);

        // Retorna a primeira capital no topo da arvore removendo do set
        System.out.println(treeCapitais.pollFirst());

        // Retorna a primeira capital do final da arvore, removendo do set
        System.out.println(treeCapitais.pollLast());

        // Exibe todas as capitais no console
        System.out.println(treeCapitais);



    }

}
