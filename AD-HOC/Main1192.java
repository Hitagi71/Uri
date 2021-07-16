package AD_HOC;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main1192 {
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		
		for (int i = 0; i < n; i++) {
			String line = in.readLine();
			
			int n1 = Character.getNumericValue(line.charAt(0));
			int n2 = Character.getNumericValue(line.charAt(2));
			char op = line.charAt(1);
			
			if(n1 == n2) {
				System.out.println(n1*n2);
			}else if(op <= 90) {
				System.out.println(-n1+n2);
			}else {
				System.out.println(n1+n2);
			}
		}
	}
}
