package Iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2554 {
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String line;
		
		while((line = in.readLine()) != null && !line.isEmpty()) {
			int n = Integer.valueOf(line.split(" ")[0]);
			int d = Integer.valueOf(line.split(" ")[1]);
			String data = "";
			boolean valido = false;
			
			for (int i = 0; i < d; i++) {
				line = in.readLine();
				
				if(valido) {
					continue;
				}
				
				data = line.split(" ")[0];
				
				for (int j = 1; j <= n; j++) {
					int valor = Integer.valueOf(line.split(" ")[j]);
					
					if(valor == 0) {
						break;
					}
					
					if(j+1 > n) {
						valido = true;						
					}
				}
			}
			
			if(valido) {
				System.out.println(data);
			} else {
				System.out.println("Pizza antes de FdI");
			}
		}
	}
}
