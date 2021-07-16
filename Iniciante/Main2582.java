package Iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2582 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int c = Integer.valueOf(in.readLine());
		
		for (int i = 0; i < c; i++) {
			String line = in.readLine();
			String valores[] = {"PROXYCITY","P.Y.N.G.", "DNSUEY!", "SERVERS", "HOST!", "CRIPTONIZE", "OFFLINE DAY", "SALT", "ANSWER!", "RAR?", "WIFI ANTENNAS"};
			
			int x = Integer.valueOf(line.split(" ")[0]);
			int y = Integer.valueOf(line.split(" ")[1]);
			
			System.out.println(valores[x+y]);
		}
	}
}
