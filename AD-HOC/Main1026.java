package AD_HOC;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1026 {
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while((line = in.readLine()) != null && !line.isEmpty()) {
			long n1 = Long.valueOf(line.split(" ")[0]);
			long n2 = Long.valueOf(line.split(" ")[1]);
			
			System.out.println(n1 ^ n2);
		}
	}
}
