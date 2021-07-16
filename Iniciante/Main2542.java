package Iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2542 {
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;
		
		while((line = in.readLine()) != null && !line.isEmpty()) {
			int n = Integer.valueOf(line);
			
			line = in.readLine();
			
			int m = Integer.valueOf(line.split(" ")[0]);
			int l = Integer.valueOf(line.split(" ")[1]);
			
			int mc[][] = new int[m][n];
			int lc[][] = new int[l][n];
			
			for (int i = 0; i < m; i++) {
				String lineValues[] = in.readLine().split(" ");
				
				for (int j = 0; j < n; j++) {
					mc[i][j] = Integer.parseInt(lineValues[j]);
				}
			}
			

			for (int i = 0; i < l; i++) {
				String lineValues[] = in.readLine().split(" ");
				
				for (int j = 0; j < n; j++) {
					lc[i][j] = Integer.parseInt(lineValues[j]);
				}
			}
			
			line = in.readLine();
			int cm = Integer.valueOf(line.split(" ")[0]) - 1;
			int cl = Integer.valueOf(line.split(" ")[1]) - 1;
			
			int s = Integer.valueOf(in.readLine()) - 1;
			
			if(mc[cm][s] > lc[cl][s]) {
				System.out.println("Marcos");
			} else if(mc[cm][s] < lc[cl][s]) {
				System.out.println("Leonardo");
			} else {
				System.out.println("Empate");
			}
		}
	}
}
