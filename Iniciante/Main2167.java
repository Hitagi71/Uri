package Iniciante;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main2167 {
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		String line = in.readLine();
		int valores[] = new int[n]; 
		for (int i = 0; i < n; i++) {
			valores[i] = Integer.parseInt(line.split(" ")[i]);
		}
		
		int index = 0;
		for (int i = 0; i < valores.length-1; i++) {
			if(valores[i] > valores[i+1]) {
				index = i+2;
				break;
			}
		}
		
		System.out.println(index);
	}
}
