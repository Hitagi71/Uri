package Iniciante;

import java.util.Scanner;

public class Main2163 {
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int m = in.nextInt();
		int planeta[][] = new int[n][m];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				planeta[i][j] =  in.nextInt();
			}
		}
		
		int l = 0;
		int c = 0;
		for (int i = 1; i < n-1; i++) {
			for (int j = 1; j < m-1; j++) {
				if(planeta[i][j] == 42) {
					if(haveLightsaber(planeta,i,j)) {
						l = i + 1;
						c = j + 1;
						System.out.println(l+" "+c);
						in.close();
						return;
					}
				}
			}
		}	
		
		System.out.println(l+" "+c);
		in.close();
	}
	
	public static boolean haveLightsaber(int m[][], int i , int j) {
		if ((m[i-1][j-1] == 7) && (m[i-1][j] == 7) && 
			(m[i-1][j+1] == 7) && (m[i][j-1] == 7) &&
			(m[i+1][j-1] == 7) && (m[i+1][j] == 7) && 
			(m[i+1][j+1] == 7) && (m[i][j+1] == 7)){
				 return true; 
		}else { 
			return false; 
		}
	}
	
	
}
