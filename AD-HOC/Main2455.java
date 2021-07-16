package AD_HOC;

import java.io.BufferedReader;
import java.io.InputStreamReader; 

public class Main2455 {
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String line = in.readLine();
		
		int p1 = Integer.parseInt(line.split(" ")[0]);
		int c1 = Integer.parseInt(line.split(" ")[1]);
		int p2 = Integer.parseInt(line.split(" ")[2]);
		int c2 = Integer.parseInt(line.split(" ")[3]);
		
		int valor1 = p1*c1;
		int valor2 = p2*c2;
		
		if(valor1 < valor2) {
			System.out.println("1");
		}else if(valor1 > valor2) {
			System.out.println("-1");
		}else {
			System.out.println("0");
		}
		
	}
}
