package Iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2626 {
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;
		
		while((line = in.readLine()) != null && !line.isEmpty()) {
			String dodo = line.split(" ")[0];
			String leo = line.split(" ")[1];
			String pepper = line.split(" ")[2];
			
			if(ganhador(dodo, leo, pepper)) {
				System.out.println("Os atributos dos monstros vao ser inteligencia, sabedoria...");
				continue;
			}
			
			if(ganhador(leo,dodo,pepper)) {
				System.out.println("Iron Maiden's gonna get you, no matter how far!");
				continue;
			}
			
			if(ganhador(pepper,dodo,leo)) {
				System.out.println("Urano perdeu algo muito precioso...");
				continue;
			}
			
			System.out.println("Putz vei, o Leo ta demorando muito pra jogar...");
		}
	}
	
	public static boolean ganhador(String s1, String s2, String s3) {
		if(s1.equals("pedra") && s2.equals("tesoura") && s3.equals("tesoura")) {
			return true;
		}
		
		if(s1.equals("papel") && s2.equals("pedra") && s3.equals("pedra")) {
			return true;
		}
		
		if(s1.equals("tesoura") && s2.equals("papel") && s3.equals("papel")) {
			return true;
		}
		
		return false;
	}
}
