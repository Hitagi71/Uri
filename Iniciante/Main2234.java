package Iniciante;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main2234 {
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat df = new DecimalFormat("0.00");
		String s = in.readLine();
		double h = Integer.valueOf(s.split(" ")[0]);
		double p = Integer.valueOf(s.split(" ")[1]);
		
		double media = h/p;
		
		System.out.println(df.format(media).replace(",", "."));
	}
}
