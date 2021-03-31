package EstruturasEBibliotecas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main1069 {
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		for (int i = 0; i < n; i++) {
			String valor = in.readLine();
			Stack<Character> pilha = new Stack<Character>(); 
			int c = 0;
			for (int j = 0; j < valor.length(); j++) {
				if(valor.charAt(j) == '<') {
					pilha.push(valor.charAt(j));
				}else {
					if(valor.charAt(j) == '>') {
						if(!pilha.isEmpty()) {
							pilha.pop();
							if(valor.charAt(j) != '>') {
								continue;
							}
							c++;
						}
					}
				}
			}
			System.out.println(c);
		}
	}
}
