package AD_HOC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1089 {
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while((line = in.readLine()) != null && !line.isEmpty()) {
			int n = Integer.parseInt(line);
			
			if(n == 0) {
				break;
			}
			
			int v[] = new int[n];
			String lineValues[] = in.readLine().split(" ");
			
			for (int i = 0; i < n; i++) {
				v[i] = Integer.valueOf(lineValues[i]);
			}
			
			int picos = 0;
			boolean flag = v[n - 1] < v[0];
			boolean forma = flag;
			for (int i = 0; i < v.length; i++) {
				if(i + 1 < v.length) {
					if(forma && v[i + 1] < v[i]) {
						picos++;
						forma = !forma;
						continue;
					}
					
					if(!forma && v[i + 1] > v[i]) {
						picos++;
						forma = !forma;
						continue;
					}
				}
			}
			
			if(flag && forma || !flag && !forma) {
				System.out.println(picos);
			}else {
				System.out.println(picos+1);
			}
		}
	}
}
