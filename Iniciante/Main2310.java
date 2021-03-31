package Iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;


public class Main2310 {
	public static void main(String[] args) throws IOException {
		DecimalFormat df = new DecimalFormat("0.00");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.valueOf(in.readLine());
		int sucesso[] = new int[3];
		int tentativas[] = new int[3];
		
		double porcentagemSaque;
		double porcentagemBloqueio;
		double porcentagemAtaque;
		
		for (int i = 0; i < n; i++) {
			in.readLine();
			String line = in.readLine();
			for (int j = 0; j < tentativas.length; j++) {
				tentativas[j] += Integer.valueOf(line.split(" ")[j]);
			}
			
			line = in.readLine();
			for (int j = 0; j < tentativas.length; j++) {
				sucesso[j] += Integer.valueOf(line.split(" ")[j]);
			}
		}
		
		porcentagemSaque = (double)(sucesso[0]*100)/tentativas[0];
		porcentagemBloqueio = (double)(sucesso[1]*100)/tentativas[1];
		porcentagemAtaque = (double)(sucesso[2]*100)/tentativas[2];
		
		
		System.out.println("Pontos de Saque: "+ df.format(porcentagemSaque).replace(",", ".") + " %.\n"
							+"Pontos de Bloqueio: "+ df.format(porcentagemBloqueio).replace(",", ".") + " %.\n"
							+"Pontos de Ataque: "+ df.format(porcentagemAtaque).replace(",", ".") + " %.");
		
	}
}
