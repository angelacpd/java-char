package corp.angela.desafio2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ParImparPosNeg {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int pares, impares, positivos, negativos;
        pares = 0;
        impares = 0;
        positivos = 0;
        negativos = 0;

        int valor1 = Integer.parseInt(st.nextToken());
        if (valor1 > 0) { positivos++; }
        if (valor1 < 0) { negativos++; }
        if (valor1 % 2 == 0) { pares++; }
        if (valor1 % 2 != 0) { impares++; }

        st = new StringTokenizer(br.readLine());
        int valor2 = Integer.parseInt(st.nextToken());
        if (valor2 > 0) { positivos++; }
        if (valor2 < 0) { negativos++; }
        if (valor2 % 2 == 0) { pares++; }
        if (valor2 % 2 != 0) { impares++; }

        st = new StringTokenizer(br.readLine());
        int valor3 = Integer.parseInt(st.nextToken());
        if (valor3 > 0) { positivos++; }
        if (valor3 < 0) { negativos++; }
        if (valor3 % 2 == 0) { pares++; }
        if (valor3 % 2 != 0) { impares++; }

        st = new StringTokenizer(br.readLine());
        int valor4 = Integer.parseInt(st.nextToken());
        if (valor4 > 0) { positivos++; }
        if (valor4 < 0) { negativos++; }
        if (valor4 % 2 == 0) { pares++; }
        if (valor4 % 2 != 0) { impares++; }

        st = new StringTokenizer(br.readLine());
        int valor5 = Integer.parseInt(st.nextToken());
        if (valor5 > 0) { positivos++; }
        if (valor5 < 0) { negativos++; }
        if (valor5 % 2 == 0) { pares++; }
        if (valor5 % 2 != 0) { impares++; }

        System.out.println(pares + " valor(es) par(es)");
        System.out.println(impares + " valor(es) impar(es)");
        System.out.println(positivos + " valor(es) positivo(s)");
        System.out.println(negativos + " valor(es) negativo(s)");
    }

}
