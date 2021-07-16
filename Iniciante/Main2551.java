package Iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2551 {
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String line;
		
		while((line = in.readLine()) != null && !line.isEmpty()) {
			int n = Integer.valueOf(line);
			double recorde = 0;
			StringBuilder msg = new StringBuilder();
			for (int i = 0; i < n; i++) {
				line = in.readLine();
				double t = Double.valueOf(line.split(" ")[0]);
				double d = Double.valueOf(line.split(" ")[1]);
				
				double velM = d / t;
				
				if(velM > recorde) {
					msg.append((i+1)+"\n");
					recorde = velM;
				}
			}
			
			System.out.print(msg);
		}
	}
}
