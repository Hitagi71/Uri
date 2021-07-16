package AD_HOC;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main2414 {
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int maior = 0;

		String line[] = in.readLine().split(" ");
		
		for (int i = 0; i < line.length; i++) {
			int n = Integer.parseInt(line[i]);
			if(n == 0) {
				break;
			}
			
			if(n > maior) {
				maior = n;
			}
		}
		
		System.out.println(maior);
	}
}
