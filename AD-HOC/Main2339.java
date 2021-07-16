package AD_HOC;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main2339 {
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line = in.readLine();
		
		int c = Integer.parseInt(line.split(" ")[0]);
		int p = Integer.parseInt(line.split(" ")[1]);
		int f = Integer.parseInt(line.split(" ")[2]);

		p /= f;
		
		if(p >= c) {
			System.out.println("S");
		}else {
			System.out.println("N");
		}		
	}
}
