package Iniciante;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main2126 {
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;
		int index=1;
		while((line = in.readLine()) != null) {
			int qtnd = 0;
			String line2 = in.readLine();
			int posicao=0;
			for (int i = 0; i < line2.length(); i++) {
				String nova = "";
				
				if(line2.charAt(i) == line.charAt(0)) {
					nova = newString(line2, i,line.length());
					
				}
					
				if(line.equals(nova)) {
					qtnd++;
					posicao = i;
				}
			}
			
			System.out.println("Caso #"+(index++)+":");
			if(qtnd == 0) {
				System.out.println("Nao existe subsequencia");
			}else {
				System.out.println("Qtd.Subsequencias: "+qtnd);
				System.out.println("Pos: "+(posicao+1));
			}
			System.out.println();
		}
	}
	
	public static String newString(String s,int i,int l) {
		String nova="";
		for (int j = i; j < i+l ; j++) {
			if(j+1>s.length()) {
				break;
			}
			nova+=s.charAt(j);
		}
		return nova;
	}
}
