package Iniciante;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1960 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int[] vaNum = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
		String[] vaRom = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
		int N = Integer.parseInt(in.readLine());
		int i = 0;
    		while (N > 0) {
			if (N >= vaNum[i]) {
				System.out.print(vaRom[i]);
				N -= vaNum[i];
			} else {
				i++;
			}
       		 }
    		System.out.print("\n");
	}
}
