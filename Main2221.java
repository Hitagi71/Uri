import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main2221 {
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(in.readLine());
		for (int i = 0; i < t; i++) {
			int b = Integer.parseInt(in.readLine());
			
			String line = in.readLine();
			int ai = Integer.valueOf(line.split(" ")[0]);
			int di = Integer.valueOf(line.split(" ")[1]);
			int li = Integer.valueOf(line.split(" ")[2]);
			
			line = in.readLine();
			int ai2 = Integer.valueOf(line.split(" ")[0]);
			int di2 = Integer.valueOf(line.split(" ")[1]);
			int li2 = Integer.valueOf(line.split(" ")[2]);
			
			int valorGolpe1 = getValorTotal(ai, di, li, b);
			int valorGolpe2 = getValorTotal(ai2, di2, li2, b);
			
			int ganhador = valorGolpe1 - valorGolpe2;
			
			if(ganhador == 0) {
				System.out.println("Empate");
			}else if(ganhador > 0) {
				System.out.println("Dabriel");
			}else {
				System.out.println("Guarte");
			}
			
		}
	}
	
	public static int getValorTotal(int a,int d,int l,int b) {
		int valorTotal;
		if(l%2==0) {
			valorTotal = ((a+d)/2)+b;
			return valorTotal;
		}else {
			valorTotal = (a+d)/2;
			return valorTotal;
		}
	}
}
