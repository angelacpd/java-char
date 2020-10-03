package corp.angela.desafio2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class NumerosPares {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int valor = Integer.parseInt(st.nextToken());
        int num = 2;

        while (num <= valor) {
            System.out.println(num);
            num += 2;
        }

    }
}