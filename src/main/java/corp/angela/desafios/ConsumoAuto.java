package corp.angela.desafio2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ConsumoAuto {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int X = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        double Y = Double.parseDouble(st.nextToken());

        double consumo = X/Y;

        System.out.println(String.format("%.3f km/l", consumo));

    }

}
