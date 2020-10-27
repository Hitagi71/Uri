package Iniciante;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main2702 {
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String line = in.readLine();
		String line2 = in.readLine();
		
		int total = 0;
		for (int i = 0; i < 3; i++) {
			int comida = Integer.parseInt(line.split(" ")[i]);
			int pessoa = Integer.parseInt(line2.split(" ")[i]);
			
			int valor = comida - pessoa;

			if(valor < 0) {
				total -= valor;
			}
		}
		
		System.out.println(total);
	}
}
