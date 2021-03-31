package Iniciante;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main2134 {
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			int n = Integer.parseInt(in.readLine());
			
			if(n == 0) {
				break;
			}
			
			for (int i = 0; i < n; i++) {
				int soma = 0;
				int v = Integer.parseInt(in.readLine());
				if(v % 2 != 0) {
					soma = (v*2)-1;
				}else {
					soma = (v*2)-2;
				}
				
				
				System.out.println(soma);
			}
		}
		
	}
}
