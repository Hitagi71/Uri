import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main2140 {
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int notas[] = {100,50,20,10,5,2};
		String line;
		while((line = in.readLine()) != null) {
			int n = Integer.valueOf(line.split(" ")[0]);
			int m = Integer.valueOf(line.split(" ")[1]);
			
			if(n == 0 && m == 0) {
				break;
			}
			
			int troco = m - n;
			int nota = 0;
			int i = 0;
			boolean flag = false;
			
			while(i < notas.length) {
				if(troco>=notas[i]) {
					troco -= notas[i];
					nota++;
				}else {
					i++;
				}
			}
						
			if(nota == 2 && troco == 0) {
				flag = true;
			}
						
			System.out.println(flag ? "possible" : "impossible");
			
		}
	}
}
