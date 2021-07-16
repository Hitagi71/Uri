package AD_HOC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null && !line.isEmpty()){
            int n = Integer.parseInt(line);

            if(n == 0) {
                break;
            }

            Stack<Integer> pilha = new Stack<>();

            for (int i = n; i > 0 ; i--) {
                pilha.push(i);
            }

            StringBuffer discarded = new StringBuffer("Discarded cards: ");
            while (pilha.size() != 1) {
                discarded.append(pilha.pop()+", ");
                if(pilha.size() > 0){
                    int valor = pilha.pop();
                    pilha.insertElementAt(valor, 0);
                }
            }

            discarded = new StringBuffer(discarded.substring(0, discarded.length() - 2));
            System.out.println(discarded+"\nRemaining card: "+pilha.pop());
        }

        in.close();
    }
}
