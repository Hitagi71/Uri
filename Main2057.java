import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2057 {
	public static void main(String[] args) throws IOException {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		String valores[] = in.readLine().split(" ");
		
		int valor=Integer.parseInt(valores[0])+Integer.parseInt(valores[1])+Integer.parseInt(valores[2]);
		if(valor>24) {
			System.out.println(valor%24);
		}else if(valor<0){
			System.out.println(24+valor);
		}else {
			System.out.println(valor);
		}
	}
}
