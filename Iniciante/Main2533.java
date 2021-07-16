package Iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main2533 {
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat df = new DecimalFormat("0.0000");
		
		String line;
		while((line = in.readLine()) != null && !line.isEmpty()) {
			int m = Integer.valueOf(line);
			double notas = 0;
			double horario = 0;
			
			for (int i = 0; i < m; i++) {
				line =  in.readLine();
				int n = Integer.valueOf(line.split(" ")[0]);
				int c = Integer.valueOf(line.split(" ")[1]);
				
				notas += n * c;
				horario += c;
			}			
			
			System.out.println(df.format(notas / (horario * 100)).replace(",", "."));
		}		
	}
}
