package GeometricaComputacional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1039 {
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while((line =  in.readLine()) != null && !line.isEmpty()) {
			int r1 = Integer.valueOf(line.split(" ")[0]);
			int x1 = Integer.valueOf(line.split(" ")[1]);
			int y1 = Integer.valueOf(line.split(" ")[2]);
			int r2 = Integer.valueOf(line.split(" ")[3]);
			int x2 = Integer.valueOf(line.split(" ")[4]);
			int y2 = Integer.valueOf(line.split(" ")[5]);
			
			double d = Math.sqrt((Math.pow(x2 - x1, 2)+Math.pow(y2 - y1, 2)));
			
			if(r1 >= d + r2) {
				System.out.println("RICO");
			}else {
				System.out.println("MORTO");
			}
		}
	}
}
