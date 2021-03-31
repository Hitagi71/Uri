package Iniciante;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main2708 {
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int turista = 0;
		int jipe = 0;
		while(true) {
			String line = in.readLine();
			String s = line.split(" ")[0];
			
		
			if(s.equals("ABEND")){
				break;
			}
			
			int t = Integer.parseInt(line.split(" ")[1]);
			
			if(s.equals("SALIDA")) {
				turista+=t;
				jipe++;
			}else {
				turista-=t;
				jipe--;
			}
		}
		System.out.println(turista);
		System.out.println(jipe);
	}
}
