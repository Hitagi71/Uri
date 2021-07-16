package Iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        int n = Integer.valueOf(in.readLine());

        for(int i = 0; i < n; i++) {
            int valor = Integer.valueOf(in.readLine());

            if(valor % 2 == 0) {
                pares.add(valor);
            } else {
                impares.add(valor);
            }
        }

        Collections.sort(pares);
        Collections.sort(impares, Comparator.reverseOrder());

        StringBuilder msg = new StringBuilder();

        for(int i = 0; i < pares.size(); i++) {
            msg.append(pares.get(i) + "\n");
        }

        for(int i = 0; i < impares.size(); i++) {
            msg.append(impares.get(i) + "\n");
        }

        System.out.print(msg);

    }
}
