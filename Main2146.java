import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main2146 {
	public static void main(String[] args) throws Exception{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		String line;
		while((line = in.readLine()) != null) {
			 int valor = Integer.parseInt(line);
			 System.out.println(valor-1);
		}

	}
}
