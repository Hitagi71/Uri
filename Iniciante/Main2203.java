package Iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2203 {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        
        while((line = in.readLine()) != null && !line.isEmpty()) {
            int xf = Integer.parseInt(line.split(" ")[0]);
            int yf = Integer.parseInt(line.split(" ")[1]);
            int xi = Integer.parseInt(line.split(" ")[2]);
            int yi = Integer.parseInt(line.split(" ")[3]);
            int vi = Integer.parseInt(line.split(" ")[4]);
            int r1 = Integer.parseInt(line.split(" ")[5]);
            int r2 = Integer.parseInt(line.split(" ")[6]);

            double d1 = Math.sqrt((Math.pow(xi - xf, 2) + Math.pow((yi - yf), 2)));

            d1 += vi * 1.5;
            int d2 = r1 + r2;

            if(d2 >= d1) {
                System.out.println("Y");
            } else {
                System.out.println("N");
            }

            
        }
    }
}
