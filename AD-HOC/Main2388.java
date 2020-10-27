package AD_HOC;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main2388 {
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(in.readLine());
		
		int soma = 0;
		for (int i = 0; i < n; i++) {
			String line = in.readLine();
			int t =  Integer.valueOf(line.split(" ")[0]);
			int v =  Integer.valueOf(line.split(" ")[1]);
			
			soma += v*t;
			
		}
		
		System.out.println(soma);
	}
}
