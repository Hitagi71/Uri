package Iniciante;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main2879 {
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(in.readLine());
		int ganhou = 0;
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(in.readLine());
			if(n!=1) {
				ganhou++;
			}
		}
		
		System.out.println(ganhou);
	}
}
