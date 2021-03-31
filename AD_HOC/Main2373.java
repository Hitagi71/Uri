package AD_HOC;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main2373 {
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(in.readLine());
		int caiu = 0;
		for (int i = 0; i < t; i++) {
			String line = in.readLine();
			
			int l = Integer.parseInt(line.split(" ")[0]);
			int c = Integer.parseInt(line.split(" ")[1]);
			
			if(l > c) {
				caiu+=c;
			}
		}
		
		System.out.println(caiu);
		
	}
}
