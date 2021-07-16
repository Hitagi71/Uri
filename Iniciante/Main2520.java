package Iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2520 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String line;

        while((line = in.readLine()) != null && !line.isEmpty()) {
            int n = Integer.parseInt(line.split(" ")[0]);
            int m = Integer.parseInt(line.split(" ")[1]);

            int np = 0;
            int mp = 0;
            int nt = 0;
            int mt = 0;

            int cidade[][] = new int[n][m];

            int passos = 0;

            for (int i = 0; i < n; i++) {
                String lineValues[] = in.readLine().split(" ");

                for (int j = 0; j < m; j++) {
                    int valor = Integer.valueOf(lineValues[j]);

                    if(valor == 2) {
                        np = i;
                        mp = j;
                    }
                    if(valor == 1) {
                        nt = i;
                        mt = j;
                    }

                    cidade[i][j] = valor;
                }
            }

            while(nt != np || mt != mp) {
                if(nt < np) {
                    nt++;
                } else if(nt > np) {
                    nt--;
                } else if (mt < mp) {
                    mt++;
                } else {
                    mt--;
                }

                passos++;
            }

            System.out.println(passos);

        }
    }
}
