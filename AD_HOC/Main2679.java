package AD_HOC;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main2679 {
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		if(n%2!=0) {
			System.out.println(n+1);
		}else {
			System.out.println(n+2);
		}
		
	}
}
