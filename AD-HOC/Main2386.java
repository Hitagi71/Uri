package AD_HOC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2386 {
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int soma = 0;
		int a = Integer.parseInt(in.readLine());
		int n = Integer.parseInt(in.readLine());
		for (int i = 0; i < n; i++) {
			int f = Integer.parseInt(in.readLine());
			int fs = f*a;
			if(fs >= 40000000) {
				soma++;
			}
		}
		
		System.out.println(soma);
		
	}
}
