package corp.angela.desafio2;

/*
Desafio
Faça a leitura de um valor inteiro. Em seguida, calcule o menor número de notas possíveis (cédulas)
onde o valor pode ser decomposto. As notas que você deve considerar são de 100, 50, 20, 10, 5, 2 e 1.
Na sequência mostre o valor lido e a relação de notas necessárias.

Entrada
Você receberá um valor inteiro N (0 < N < 1000000).

Saída
Exiba o valor lido e a quantidade mínima de notas de cada tipo necessárias, seguindo o exemplo de saída abaixo.
Após cada linha deve ser imprimido o fim de linha, caso contrário será apresentada a seguinte mensagem: “Presentation Error”.

 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ContaCedulas {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int valor = Integer.parseInt(st.nextToken());
        int n100, n50, n20, n10, n5, n2, n1, resto, total;

        total = valor;

//        resto = 0;
//        n100 = 0;
//        n50 = 0;
//        n20 = 0;
//        n10 = 0;
//        n5 = 0;
//        n2 = 0;
//        n1 = 0;

        resto = valor % 100;
        n100 = (valor - resto) / 100;

        valor = resto;
        resto = valor % 50;
        n50 = (valor - resto) / 50;

        valor = resto;
        resto = valor % 20;
        n20 = (valor - resto) / 20;

        valor = resto;
        resto = valor % 10;
        n10 = (valor - resto) / 10;

        valor = resto;
        resto = valor % 5;
        n5 = (valor - resto) / 5;

        valor = resto;
        resto = valor % 2;
        n2 = (valor - resto) / 2;

        n1 = resto;

        System.out.println(total + "\n");
        System.out.println(n100 + " nota(s) de R$ 100,00");
        System.out.println(n50 + " nota(s) de R$ 50,00");
        System.out.println(n20 + " nota(s) de R$ 20,00");
        System.out.println(n10 + " nota(s) de R$ 10,00");
        System.out.println(n5 + " nota(s) de R$ 5,00");
        System.out.println(n2 + " nota(s) de R$ 2,00");
        System.out.println(n1 + " nota(s) de R$ 1,00");
    }

}
