package Iniciante;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main2791 {
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String line[] = in.readLine().split(" ");
		int p=0;
		
		for (int i = 0; i < line.length; i++) {
			int valor = Integer.parseInt(line[i]);
			if(valor == 1) {
				p = i+1;
				break;
			}
		}
		
		System.out.println(p);
	}
}
