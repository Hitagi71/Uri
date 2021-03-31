package Iniciante;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2546 {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        String line;
        while((line = in.readLine()) != null && !line.isEmpty()) {
            int t = Integer.valueOf(line.split(" ")[0]);
            int i = Integer.valueOf(line.split(" ")[1]);
            int c = 0;

            for (int j = 0; j < t; j++) {
                line = in.readLine();
                int n = Integer.valueOf(line.split(" ")[0]);
                int g = Integer.valueOf(line.split(" ")[1]);

                if(i == n && g==0) {
                    c++;
                }
            }

            System.out.println(c);
        }
    }
}
