package AD_HOC;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main1031{
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			int n = Integer.parseInt(in.readLine());
			
			if(n == 0) {
				break;
			}
			
			int m = 0;
			
			for (int i = 1; i < 200; i++) {
				int valor = josephus(n-1, i);
				if(valor == 12) {
					m = i;
					break;
				}
			}
			
			System.out.println(m);
			
		}
	}
	
	public static int josephus(int n, int k) {
		return n > 1 ? (josephus(n-1, k) + k -1)% n + 1 : 1;
	}
}
