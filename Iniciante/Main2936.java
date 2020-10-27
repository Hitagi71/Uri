package Iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2936 {
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int gramas[] = {300, 1500, 600, 1000, 150};
		int pratos[] =  new int[5];
		
		for (int i = 0; i < pratos.length; i++) {
			pratos[i] =  Integer.parseInt(in.readLine());
		}
		
		int soma = 0 ;
		
		for (int i = 0; i < pratos.length; i++) {
			soma +=pratos[i]*gramas[i];
		}
		
		System.out.println(soma+225);
	}
}
