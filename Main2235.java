import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main2235 {
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line = in.readLine();
		
		int a = Integer.valueOf(line.split(" ")[0]);
		int b = Integer.valueOf(line.split(" ")[1]);
		int c = Integer.valueOf(line.split(" ")[2]);
		
		if(a-b ==0 || a-c ==0 || b-c==0) {
			System.out.println("S");
		}else if(a+b-c==0 || a+c-b==0 || b+c-a==0) {
			System.out.println("S");
		}else {
			System.out.println("N");
		}
	}
}
