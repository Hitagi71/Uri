package Iniciante;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main2176 {
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int um = 0;
		String s = in.readLine();
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '1') {
				um++;
			}
		}
		
		if(um%2 == 0) {
			System.out.println(s+"0");
		}else {
			System.out.println(s+"1");
		}
		
	}
}
