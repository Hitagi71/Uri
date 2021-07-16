package AD_HOC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1103 {
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while((line = in.readLine()) != null && !line.isEmpty()) {
			int h1 = Integer.valueOf(line.split(" ")[0]);
			int m1 = Integer.valueOf(line.split(" ")[1]);
			int h2 = Integer.valueOf(line.split(" ")[2]);
			int m2 = Integer.valueOf(line.split(" ")[3]);
			
			if(h1 == 0 && m1 ==0 && h2 == 0 && m2==0) {
				break;
			}
			
			h1*=60;
			h2*=60;
			
			int min = 0;
			int minT1 = h1+m1;
			int minT2 = h2+m2;
			
			while(minT1 != minT2) {
				if(minT1 == 1440) {
					minT1=0;
				}
				min++;
				minT1++;
			}
			
			System.out.println(min);
			
		}
	}
}
