package Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Main2523 {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            char a[] = in.next().toCharArray();
            int t = in.nextInt();
            
            StringBuffer msg = new StringBuffer("");

            for (int i = 0; i < t; i++) {
                int l = in.nextInt();
                msg.append(a[l-1]);
            }

            System.out.println(msg);
        }
        
        in.close();
    }
}
