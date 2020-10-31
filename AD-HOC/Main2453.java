package AD_HOC;

import java.io.BufferedReader;
import java.io.InputStreamReader; 



public class Main2453 {
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String line = in.readLine();
		
		int p = Integer.parseInt(line.split(" ")[0]);
		int r = Integer.parseInt(line.split(" ")[1]);
		
		if(p == 0) {
			System.out.println("C");
		}else if(r == 0) {
			System.out.println("B");
		}else {
			System.out.println("A");
		}
	}
}
