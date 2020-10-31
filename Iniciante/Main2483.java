package Iniciante;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main2483 {
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String msg = "Feliz nat";
		int i = Integer.parseInt(in.readLine());
		
		for (int j = 0; j < i; j++) {
			msg+="a";
		}
		
		msg+="l!";
		
		System.out.println(msg);
		
	}
}
