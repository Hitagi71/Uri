package Iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main2334 {
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String line = in.readLine();
			if(!line.equals("")) {
				BigInteger p = new BigInteger(line);
				if(p.equals(new BigInteger("-1"))) {
					break;
				}
				
				if(p.equals(new BigInteger("0"))) {
					System.out.println("0");
				} else {
					System.out.println(p.subtract(new BigInteger("1")));
				}

			}
			
			
		}
	}
}
