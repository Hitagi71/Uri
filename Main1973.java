import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1973 {
	public static void main(String[] args) throws IOException {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int n= Integer.parseInt(in.readLine());
		String valores[]= in.readLine().split(" ");
		
		int estrelas[]=new int[n];
		int visitados[] = new int[n];
		int p=0;
		
		for (int i = 0; i < valores.length; i++) {
			estrelas[i] = Integer.parseInt(valores[i]);
			visitados[i] = 0;
		}
		
		do{
			if(estrelas[p]%2!=0) {
				p++;
				if(estrelas[p-1]>0) {
					estrelas[p-1]--;
					visitados[p-1]=1;
				}

			}else {
				p--;
				if(estrelas[p+1]>0) {
					estrelas[p+1]--;
					visitados[p+1]=1;
				}
			}
			
		}while(p>=0 && p<estrelas.length);
		
		long somaEstrela=0;
		long somaVisitados=0;
		for (int i = 0; i < visitados.length; i++) {
			somaEstrela+=estrelas[i];
			somaVisitados+=visitados[i];
		}
		
		System.out.println(somaVisitados+" "+somaEstrela);
	}
}
