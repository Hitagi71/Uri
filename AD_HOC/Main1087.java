package AD_HOC;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main1087 {
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while((line = in.readLine()) != null && !line.isEmpty()) {
			int x1 = Integer.parseInt(line.split(" ")[0]);
			int y1 = Integer.parseInt(line.split(" ")[1]);
			int x2 = Integer.parseInt(line.split(" ")[2]);
			int y2 = Integer.parseInt(line.split(" ")[3]);
			
			if(x1 == 0 && y1 ==0
				&& x2 == 0 && y2 ==0) {
				break;
			}
						
			int cima = 0;
			int baixo = 0;
			int esq = 0;
			int dir = 0;
			int diaP = 0;
			int diaS = 0;
			
			while(x1 != x2 || y1 != y2) {
				if(eDiagonal(x1, x2, y1, y2)) {
					if(x1 > x2 && y1 > y2) {
						diaP = 1;
						x1 --;
						y1 --;
					}else if(x1 < x2 && y1 < y2) {
						diaP = 1;
						x1 ++;
						y1 ++;
					}else if(x1 < x2 && y1 > y2) {
						diaS = 1;
						x1++;
						y1--;
					}else {
						diaS = 1;
						x1--;
						y1++;
					}
				}else {
					if(x1 != x2) {
						if(x1 > x2) {
							cima = 1;
							x1--;
						}else {
							baixo = 1;
							x1++;
						}
					}else {
						if(y1 > y2) {
							esq = 1;
							y1--;
						}else {
							dir = 1;
							y1++;
						}
					}
				}
			}			
			System.out.println(cima+baixo+esq+dir+diaP+diaS);
		}
	}
	
	public static boolean eDiagonal(int x1, int x2, int y1, int y2){
		if(x1 != x2 && y1 != y2) {
			return true;
		}else {
			return false;
		}
	}
}
