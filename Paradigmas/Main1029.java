package Paradigmas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1029 {
	static int c;
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		for (int i = 0; i < n; i++) {
			int p = Integer.parseInt(in.readLine());
			int f = fib(p);
			System.out.println("fib("+p+") = "+(c-1)+" calls = "+f);
			c = 0;
		}	
	}
	
	public static int fib(int n) {
		c++;
		if(n < 2) {
			return n;
		}	
		return fib(n-1)+fib(n-2);
	}
}


