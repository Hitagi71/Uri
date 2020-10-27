package Iniciante;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1958 {
	public static void main(String[] args) throws IOException {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		double valor= Double.parseDouble(in.readLine());
		if(Double.toString(valor).charAt(0)!='-') {
			System.out.printf("+%.4E\n",valor);
		}else {
			System.out.printf("%.4E\n",valor);
		}
	}
}