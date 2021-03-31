package Iniciante;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main2147 {
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat df = new DecimalFormat("0.00");
		int c = Integer.parseInt(in.readLine());
		for (int i = 0; i < c; i++) {
			String s = in.readLine();
			double valor = s.length()*0.01;
			System.out.println(df.format(valor).replace(",", "."));
		}
		
	}
}
