package Iniciante;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main2152 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		for (int i = 0; i < n; i++) {
			String line = in.readLine();
			int h = Integer.valueOf(line.split(" ")[0]);
			int m = Integer.valueOf(line.split(" ")[1]);
			int o = Integer.valueOf(line.split(" ")[2]);
			
			StringBuffer string = new StringBuffer();
			if(String.valueOf(h).length()>1) {
				string.append(h);
			}else {
				string.append("0"+h);
			}
		
			if(String.valueOf(m).length()>1) {
				string.append(":"+m);
			}else {
				string.append(":0"+m);
			}
			
			if(o==1) {
				System.out.println(string + " - A porta abriu!");
			}else {
				System.out.println(string + " - A porta fechou!");
			}
		}
	}
}
