package Iniciante;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main2172 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			String line = in.readLine();
			int x = Integer.valueOf(line.split(" ")[0]);
			long m = Integer.valueOf(line.split(" ")[1]);
			
			if(x==0 && m== 0) {
				break;
			}
			
			System.out.println(x*m);
			
		}
	}
}
