package Iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2313 {
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String line = in.readLine();
		
		int a = Integer.valueOf(line.split(" ")[0]);
		int b = Integer.valueOf(line.split(" ")[1]);
		int c = Integer.valueOf(line.split(" ")[2]);
		
		if(a >= b + c || b >= a + c || c >= a + b) {
			System.out.println("Invalido");
		} else {
			if(a == b && c == b) {
				System.out.println("Valido-Equilatero");
			} else if(a != b && b != c && a!=c) {
				System.out.println("Valido-Escaleno");
			} else {
				System.out.println("Valido-Isoceles");
			}
			
			int hipotenusa;
			int cateto1, cateto2;
			
			
			if(a > b && a > c) {
				hipotenusa = a * a;
				cateto1 =  b * b;
				cateto2 = c * c;

			} else if( b > a && b > c) {
				hipotenusa = b * b;
				cateto1 =  a * a;
				cateto2 = c * c;
			} else {
				hipotenusa = c * c;
				cateto1 =  b * b;
				cateto2 = a * a;
			}
			
			if(hipotenusa == (cateto1 + cateto2)) {
				System.out.println("Retangulo: S");
			}else  {
				System.out.println("Retangulo: N");
			}
			
			
			
		}
		
	}
}
