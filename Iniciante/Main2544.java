package Iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2544 {
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String line;
		while((line = in.readLine()) != null && !line.isEmpty()) {
			int valor = Integer.valueOf(line);
			
			System.out.println((int)(Math.log(valor) / Math.log(2)));			
		}
	}
}
