import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2031 {
	public static void main(String[] args) throws IOException {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int n= Integer.parseInt(in.readLine());
		for (int i = 0; i < n; i++) {
			String j1=in.readLine();
			String j2=in.readLine();
			
			if(j1.equals("ataque")) {
				if(j2.equals("pedra")) {
					System.out.println("Jogador 1 venceu");
				}else if(j2.equals("papel")) {
					System.out.println("Jogador 1 venceu");
				}else {
					System.out.println("Aniquilacao mutua");
				}
			}else if(j1.equals("pedra")){
				if(j2.equals("pedra")) {
					System.out.println("Sem ganhador");
				}else if(j2.equals("papel")) {
					System.out.println("Jogador 1 venceu");
				}else {
					System.out.println("Jogador 2 venceu");
				}
			}else {
				if(j2.equals("pedra")) {
					System.out.println("Jogador 2 venceu");
				}else if(j2.equals("papel")) {
					System.out.println("Ambos venceram");
				}else {
					System.out.println("Jogador 2 venceu");
				}
			}
			
		}
	}
}
