package Matematica;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main2232 {
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(in.readLine());
		
		for (int k = 0; k < t; k++) {
			int n = Integer.parseInt(in.readLine());
			int valores[][] = new int[n][n];
			
			int soma = 0;
		
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < i+1; j++) {
					if(valido(i,j,i+1)) {
						valores[i][j] = valores[i-1][j]+valores[i-1][j-1];
					}else {
						valores[i][j] = 1;
					}
					
					soma+=valores[i][j];
				}
			}
			
			System.out.println(soma);
		}
		
	}
	
	public static boolean valido(int i, int j, int n) {
		if(i - 1 < 0) {
			return false;
		}
		
		
		if(j - 1 < 0) {
			return false;
		}
		
		if(j + 1 > n) {
			return false;
		}
		
		
		return true;
	}
}
