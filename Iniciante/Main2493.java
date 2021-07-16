package Iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main2493 {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while ((line = in.readLine()) != null && !line.isEmpty()) {
            int t = Integer.valueOf(line.trim());

            String expressoes[] = new String[t];

            for (int i = 0; i < t; i ++) {
                expressoes[i] = in.readLine();
            }

            ArrayList<String> nomes=  new ArrayList<>();
            for (int i = 0; i < t; i ++) {
                String lineValues[] = in.readLine().split(" ");

                String nome = lineValues[0];
                int index = Integer.valueOf(lineValues[1]);
                String operador = lineValues[2];

                String expressao[] = expressoes[index - 1].split(" ");
                int valor1 = Integer.valueOf(expressao[0]);

                expressao = expressao[1].split("=");
                int valor2 = Integer.valueOf(expressao[0]);

                int resultado = Integer.valueOf(expressao[1]);

                int calculo;

                if(operador.equals("+")) {
                    calculo = valor1 + valor2;
                } else  if(operador.equals("-")) {
                    calculo = valor1 - valor2;
                } else if(operador.equals("*")){
                    calculo = valor1 * valor2;
                } else {
                    calculo = valor1 + valor2;
                    if(calculo == resultado) {
                        nomes.add(nome);
                        continue;
                    }

                    calculo = valor1 - valor2;
                    if(calculo == resultado) {
                        nomes.add(nome);
                        continue;
                    }

                    calculo = valor1 * valor2;
                    if(calculo == resultado) {
                        nomes.add(nome);
                        continue;
                    }

                    continue;

                }


                if(calculo != resultado) {
                    nomes.add(nome);
                }

            }

            if(nomes.size() == t) {
                System.out.println("None Shall Pass!");
            } else if(nomes.isEmpty()) {
                System.out.println("You Shall All Pass!");
            } else {
                Collections.sort(nomes);
                StringBuilder msg = new StringBuilder();
                for(String nome : nomes) {
                    msg.append(nome + " ");
                }

                System.out.println(msg.substring(0, msg.length() - 1));
            }
        }
    }
}
