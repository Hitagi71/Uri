import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2374 {
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(in.readLine());
		int m = Integer.parseInt(in.readLine());
		
		System.out.println(n-m);
	}
}
