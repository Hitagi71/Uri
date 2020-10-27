package Iniciante;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1962 {
	public static void main(String[] args) throws IOException {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
    	int n = Integer.parseInt(in.readLine());
    	for (int i = 0; i < n; i++) {
    		int valor = Integer.parseInt(in.readLine());
    		if(valor>2015) {
    			valor-=2014;
    			System.out.println(valor+" A.C.");
    		}else {
    			if(valor==2015) {
    				System.out.println("1 A.C.");
    			}else {
    				valor-=2015;
        			System.out.println(Math.abs(valor)+" D.C.");
    			}	
    		}
    	}
	}
}