package Iniciante;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main2166 {
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat df = new DecimalFormat("0.0000000000");
		int n = Integer.parseInt(in.readLine());
		double raiz = 2;
		for (int i = 0; i < n; i++) {
				raiz = 2+ 1.0/raiz;
		}
		
		System.out.println(df.format(raiz-1).replace(",", "."));
	}
}
