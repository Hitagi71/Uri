package Iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2547 {
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;
		
		while((line = in.readLine()) != null && !line.isEmpty()) {
			int n = Integer.valueOf(line.split(" ")[0]);
			int aMin = Integer.valueOf(line.split(" ")[1]);
			int aMax = Integer.valueOf(line.split(" ")[2]);
			int pessoas = 0;
			
			for (int i = 0; i < n; i++) {
				int valor = Integer.valueOf(in.readLine());
				if(aMax >= valor && aMin <= valor) {
					pessoas++;
				}
			}
			
			System.out.println(pessoas);			
		}
	}
}
