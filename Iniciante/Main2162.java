package Iniciante;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main2162 {
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(in.readLine());
		int valores[] = new int[n];
		String line = in.readLine();
		boolean flag = true;

		for (int i = 0; i < valores.length; i++) {
			valores[i] = Integer.parseInt(line.split(" ")[i]);
		}
		
		boolean padrao = valores[0] == valores[1];
		
		if(padrao) {
			System.out.println("0");
		}else {
			padrao = valores[0] > valores[1];
			for (int i = 1; i < valores.length; i++) {
				if(i + 1 < valores.length) {
					if(valores[i] >= valores[i+1] && padrao) {
						flag = false;
						break;
					}
					
					if(valores[i] <= valores[i+1] && !padrao) {
						flag = false;
						break;
					}
				}
				
				padrao = !padrao;
			}
			
			
			System.out.println(flag ? "1" : "0");
		}
	}
}
