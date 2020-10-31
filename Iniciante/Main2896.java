package Iniciante;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main2896 {
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(in.readLine());
		
		for (int i = 0; i < t; i++) {
			String line = in.readLine();
			int n = Integer.valueOf(line.split(" ")[0]);
			int k = Integer.valueOf(line.split(" ")[1]);
			
			if(k > n) {
				System.out.println(n);
			}else {
				int garrafas = (n/k) + (n%k);
				System.out.println(garrafas);
			}
		}
	}
}
