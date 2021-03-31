package Matematica;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1028 {
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(in.readLine());
		for (int i = 0; i < n; i++) {
			String line = in.readLine();
			int f1 = Integer.valueOf(line.split(" ")[0]);
			int f2 = Integer.valueOf(line.split(" ")[1]);
			
			System.out.println(mdc(f1,f2));
		}
	}
	
	public static int mdc(int n1, int n2) {
		if(n2 == 0 ) {
			return n1;
		}
			
		return mdc(n2, n1%n2);
	}
}
