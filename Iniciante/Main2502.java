package Iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2502 {
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;
		
		while((line = in.readLine()) != null && !line.isEmpty()) {
			int n = Integer.valueOf(line.split(" ")[1]);
			
			char[] cifra1 = in.readLine().toCharArray();
			char[] cifra2 = in.readLine().toCharArray();
			
			StringBuilder msg = new StringBuilder();
			
			for (int i = 0; i < n; i++) {
				line = in.readLine();
				for (int j = 0; j < line.length(); j++) {
					String value = String.valueOf(line.charAt(j));
					Character descifrado = decifrado(cifra1, cifra2, value);
					msg.append(descifrado);
				}
				
				msg.append("\n");					
			}
			
			System.out.println(msg);
		}
		
		
	}
	
	public static Character decifrado(char[] cifra1, char[] cifra2, String valor) {
		for (int i = 0; i < cifra1.length; i++) {
			boolean maiscula = false;
			
			if(valor.charAt(0) > 64 && valor.charAt(0) < 91) {
				maiscula = true;
			}
			
			
			if(valor.equalsIgnoreCase(String.valueOf(cifra1[i]))) {
				if(maiscula) {
					return cifra2[i];
				} else {
					return Character.toLowerCase(cifra2[i]);
				}
			}
			
			if(valor.equalsIgnoreCase(String.valueOf(cifra2[i]))) {
				if(maiscula) {
					return cifra1[i];
				} else {
					return Character.toLowerCase(cifra1[i]);
				}
			}
		}
		
		return valor.charAt(0);
	}
}
