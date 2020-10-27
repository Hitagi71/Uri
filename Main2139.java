import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main2139 {
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	    int valores[] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 25};
		String line;
		while((line = in.readLine()) != null) {
			int mes = Integer.valueOf(line.split(" ")[0]);
			int dia = Integer.valueOf(line.split(" ")[1]);
			int dias = 0;
			for (int i = 0; i < mes-1; i++) {
				dias+=valores[i];
			}
			
			int n = 360 - (dias+dia);
			if(n==0) {
				System.out.println("E natal!");
			}else if(n == 1) {
				System.out.println("E vespera de natal!");
			}else if(n > 0) {
				System.out.println("Faltam "+n+" dias para o natal!");
			}else {
				System.out.println("Ja passou!");
			}
			
		}
	}
}
