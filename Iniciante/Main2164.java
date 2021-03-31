package Iniciante;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main2164 {
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat df = new DecimalFormat("0.0");
		
		int n = Integer.parseInt(in.readLine());
		double valor1 = (1 + Math.sqrt(5))/2;
		double valor2 = (1 - Math.sqrt(5))/2;
		double fib = (Math.pow(valor1, n))- (Math.pow(valor2, n));
		fib/=Math.sqrt(5);
		System.out.println(df.format(fib).replace(",", "."));
	}
}
