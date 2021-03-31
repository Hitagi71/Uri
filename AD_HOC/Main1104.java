package AD_HOC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main1104 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null && !line.isEmpty()){
            int a = Integer.parseInt(line.split(" ")[0]);
            int b = Integer.parseInt(line.split(" ")[1]);

            if(a == 0 && b==0){
                break;
            }

            ArrayList<Integer> cartasA = new ArrayList<>();
            ArrayList<Integer> cartasB = new ArrayList<>();

            line = in.readLine();
            for (int i = 0; i < a; i++){
                cartasA.add(Integer.parseInt(line.split(" ")[i]));
            }

            line = in.readLine();
            for (int i = 0; i < b; i++){
                cartasB.add(Integer.parseInt(line.split(" ")[i]));
            }

            int trocas = 0;

            while (!cartasA.isEmpty() && !cartasB.isEmpty()){
                int valorA = cartasA.get(0);
                int valorB = cartasB.get(0);

                if(cartasA.contains(valorB)) {
                    cartasA.removeAll(Arrays.asList(valorB));
                    cartasB.removeAll(Arrays.asList(valorB));

                }else {

                    cartasA.removeAll(Arrays.asList(valorA));
                    cartasB.removeAll(Arrays.asList(valorB));

                    trocas++;
                }
            }

            System.out.println(trocas);
        }

        in.close();
    }
}
