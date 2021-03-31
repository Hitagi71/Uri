package Iniciante;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main2344 {
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(in.readLine());
		
		if(n == 0) {
			System.out.println("E");
		}else if(n>0 && n<36) {
			System.out.println("D");
		}else if(n>35 && n<61) {
			System.out.println("C");
		}else if(n>60 && n<86) {
			System.out.println("B");
		}else {
			System.out.println("A");
		}
		
	}
}
