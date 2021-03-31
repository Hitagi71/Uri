package Iniciante;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main2780 {
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int d = Integer.parseInt(in.readLine());
		
		if(d <= 800) {
			System.out.println(1);
		}else if(d <= 1400) {
			System.out.println(2);
		}else {
			System.out.println(3);
		}
	}
}
