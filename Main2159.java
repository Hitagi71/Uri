import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main2159 {
	public static void main(String[] args) throws Exception{
		DecimalFormat df = new DecimalFormat("0.0");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		
		double minimo = n/(Math.log(n));
		double maximo = 1.25506*(n/Math.log(n));
		
		System.out.println(df.format(minimo).replace(",", ".")+" "+df.format(maximo).replace(",", "."));
	}
}
