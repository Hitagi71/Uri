package AD_HOC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1091 {
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while((line = in.readLine()) != null && !line.isEmpty()) {
			int k = Integer.parseInt(line);
			
			if(k == 0) {
				break;
			}
			
			line = in.readLine();
			
			int n = Integer.valueOf(line.split(" ")[0]);
			int m = Integer.valueOf(line.split(" ")[1]);
			
			for (int i = 0; i < k; i++) {
				line  = in.readLine();
				int x = Integer.valueOf(line.split(" ")[0]);
				int y = Integer.valueOf(line.split(" ")[1]);

				if(x == n || y==m) {
					System.out.println("divisa");
				}else if(x > n && y > m) {
					System.out.println("NE");
				}else if(x < n && y > m) {
					System.out.println("NO");
				}else if(x > n && y < m) {
					System.out.println("SE");
				}else {
					System.out.println("SO");
				}
			}
		}
	}
}