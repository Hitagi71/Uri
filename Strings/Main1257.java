package Strings;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main1257 {
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(in.readLine());
		
		for (int i = 0; i < n; i++) {
			int hash = 0;
			int l = Integer.parseInt(in.readLine());
			for (int j = 0; j < l; j++) {
				String s = in.readLine();
				for (int k = 0; k < s.length(); k++) {
					hash += (int)s.charAt(k)-65 + j + k; 
				} 
			}
			
			System.out.println(hash);
		}
	}
}
