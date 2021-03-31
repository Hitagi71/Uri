package AD_HOC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1030 {
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int nc = Integer.parseInt(in.readLine());
		int cases = 0;
		for (int i = 0; i < nc; i++) {
			String line = in.readLine();
			int n = Integer.valueOf(line.split(" ")[0]);
			int k = Integer.valueOf(line.split(" ")[1]);
			
			System.out.println("Case "+(++cases)+": "+josephus(n, k));
		}
	}
	
	public static int josephus(int n, int k) {
		return n > 1 ? (josephus(n-1, k) + k -1)% n + 1 : 1;
	}
}
