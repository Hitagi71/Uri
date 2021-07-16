package Iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main1104 {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String line = in.readLine();

            int a = Integer.parseInt(line.split(" ")[0]);
            int b = Integer.parseInt(line.split(" ")[1]);

            if (a == 0 && b == 0) {
                break;
            }

            Set<Integer> cartasA = new HashSet<>();
            Set<Integer> cartasB = new HashSet<>();

            String lineValues[] = in.readLine().split(" ");
            for (int i = 0; i < a; i++) {
                cartasA.add(Integer.valueOf(lineValues[i]));
            }

            lineValues = in.readLine().split(" ");
            for (int i = 0; i < b; i++) {
               cartasB.add(Integer.valueOf(lineValues[i]));
            }

            int trocas = 0;

            if(cartasA.size() < cartasB.size()) {
                trocas = trocas(cartasA, cartasB);
            } else {
                trocas = trocas(cartasB, cartasA);
            }

            System.out.println(trocas);
        }
    }

    private static Integer trocas(Set<Integer> menor, Set<Integer> maior) {
        int trocas = 0;

        for (Integer valor: menor) {
            if(!maior.contains(valor)) {
                trocas++;
            }
        }

        return trocas;
    }

}
