package Iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2540 {
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while((line = in.readLine()) != null && !line.isEmpty()) {
			double total = Integer.valueOf(line);
			
			double doisTercos = (2.0 * total) / 3.0;
			int cont = 0;
			boolean impeatchment = false;
								
			String lineValues[] = in.readLine().split(" ");
			for (int i = 0; i < total; i++) {
				int valor = Integer.valueOf(lineValues[i]);
				
				if(valor == 1) {
					cont++;
				}
				
				if(cont >= doisTercos) {
					impeatchment = true;
					break;
				}
			}
			
			System.out.println(impeatchment ? "impeachment" : "acusacao arquivada");
		}
	}
}
