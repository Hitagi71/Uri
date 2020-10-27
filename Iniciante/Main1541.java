package Iniciante;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1541 {
	public static void main(String[] args) throws IOException {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			String valor[]=in.readLine().split(" ");
			if(Integer.parseInt(valor[0])==0) {
				break;
			}

			int total=Integer.parseInt(valor[0])*Integer.parseInt(valor[1])*100;


			System.out.println((int)Math.sqrt(total/Integer.parseInt(valor[2])));
		}
	}
}
