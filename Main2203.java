import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2203 {
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while((line = in.readLine()) != null && !line.isEmpty()) {
			int xf = Integer.parseInt(line.split(" ")[0]);
			int yf = Integer.parseInt(line.split(" ")[1]);
			
			int xi = Integer.parseInt(line.split(" ")[2]);
			int yi = Integer.parseInt(line.split(" ")[3]);
			
			int vi = Integer.parseInt(line.split(" ")[4]);
			
			int ru = Integer.parseInt(line.split(" ")[5]);
			int rc = Integer.parseInt(line.split(" ")[6]);
			
			int valor = ru+rc;
			
		}
		
		in.close();
	}
}