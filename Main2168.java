import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main2168 {
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		int rua[][] = new int[n+1][n+1];
		
		for (int i = 0; i < n+1; i++) {
			String line = in.readLine();
			for (int j = 0; j < n+1; j++) {
				rua[i][j]=Integer.valueOf(line.split(" ")[j]);
			}
		}
		
		int quadras[] = new int[3];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				int cont = 0;
				
				if(rua[i][j]==1) {
					cont++;
				}
				
				quadras = getQuadras(rua,i,j);
				if(isSeguro(quadras,cont)) {
					System.out.print("S");
				}else {
					System.out.print("U");
				}
			}
			System.out.println();
		}
	}
	
	public static boolean isSeguro(int q[],int cont) {
		for (int i = 0; i < q.length; i++) {
			if(cont==2) {
				break;
			}
			if(q[i] == 1) {
				cont++;
			}
		}
		
		
		if(cont==2) {
			return true;
		}else {
			return false;
		}
	}
	
	public static int[] getQuadras(int m[][], int i,int j) {
		int quadras[] = new int[3];
		int index = 0;
		quadras[index++] = getBaixo(m,i,j);
		quadras[index++] = getDireita(m,i,j);
		quadras[index++] = getBaixoDireita(m,i,j);
		
		return quadras;
		
	}
		
	public static int getBaixo(int m[][],int i,int j) {
		return m[i+1][j];
	}
	
	public static int getDireita(int m[][],int i,int j) {
		return m[i][j+1];
	}
	
	
	public static int getBaixoDireita(int m[][],int i,int j) {
		return m[i+1][j+1];
	}
	
	
}

