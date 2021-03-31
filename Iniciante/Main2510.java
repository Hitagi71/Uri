package Iniciante;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main2510 {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(in.readLine());

        for (int i = 0; i < t; i++) {
            String n = in.readLine();
            if(n.equals("Batmain")) {
                System.out.println("N");
            }else {
                System.out.println("Y");
            }
        }
    }
}
