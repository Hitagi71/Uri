package Iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2552 {
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;
		
		while((line = in.readLine()) != null && !line.isEmpty()) {
			int n = Integer.valueOf(line.split(" ")[0]);
			int m = Integer.valueOf(line.split(" ")[1]);
			
			int tabuleiro[][] = new int[n][m];
			
			for (int i = 0; i < n; i++) {
				line = in.readLine();
				for (int j = 0; j < m; j++) {
					tabuleiro[i][j] = Integer.valueOf(line.split(" ")[j]);
				}
			}
			
			int novoTabuleiro[][] = new int[n][m];
			
			StringBuffer msg = new StringBuffer();
			
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					novoTabuleiro[i][j] = getValue(tabuleiro, i, j);
					msg.append(novoTabuleiro[i][j]);
				}
				msg.append("\n");
			}
			
			System.out.print(msg);
		}
	}
	
	public static int getValue(int matriz[][], int l, int c) {
		if(matriz[l][c] == 1) {
			return 9;
		} else {
			int valor = 0;
			valor += getCima(matriz, l, c);
			valor += getBaixo(matriz, l, c);
			valor += getDireita(matriz, l, c);
			valor += getEsquerda(matriz, l, c);
			
			return valor;
		}
	}
	
	public static int getCima(int matriz[][], int l, int c) {
		if(l - 1 > -1) {
			if(matriz[l-1][c] == 1) {
				return 1;
			}
		}
		
		return 0;
	}
	
	public static int getBaixo(int matriz[][], int l, int c) {
		if(l + 1 < matriz.length) {
			if(matriz[l+1][c] == 1) {
				return 1;
			}
		}
		
		return 0;
	}
	
	public static int getDireita(int matriz[][], int l, int c) {
		if(c + 1 < matriz[0].length) {
			if(matriz[l][c + 1] == 1) {
				return 1;
			}
		}
		
		return 0;
	}
	
	public static int getEsquerda(int matriz[][], int l, int c) {
		if(c - 1 > -1) {
			if(matriz[l][c - 1] == 1) {
				return 1;
			}
		}
		
		return 0;
	}
}
