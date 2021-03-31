package Iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main2311 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat df = new DecimalFormat("0.00");
		int n = Integer.parseInt(in.readLine());
		
		for (int i = 0; i < n; i++) {
			String nome = in.readLine();
			
			double notas[] = new double[7];
			double dificuldade = Double.parseDouble(in.readLine());
			double maior = 0;
			double menor = 11;
			String line = in.readLine();
			
			for (int j = 0; j < notas.length; j++) {
				double valor = Double.parseDouble(line.split(" ")[j]);
				if(valor > maior) {
					maior = valor;
				}
				
				if(valor < menor) {
					menor = valor;
				}
				
				notas[j] = valor;
				
			}
			
			double soma = 0;
			for (int j = 0; j < notas.length; j++) {
				if(notas[j] != maior && notas[j]!= menor) {
					soma += notas[j];
				}
			}
			
			System.out.println(nome + " " + df.format(soma * dificuldade).replace(",", "."));
			
		}
		
	}
}
