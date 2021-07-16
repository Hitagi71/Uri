package EstruturasEBibliotecas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main1065 {
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String valor;
		while((valor = in.readLine()) != null && !valor.isEmpty()) {
			Stack<Character> pilha = new Stack<Character>(); 
			boolean flag = true;
			for (int i = 0; i < valor.length(); i++) {
				if(valor.charAt(i) == '(') {
					pilha.push(valor.charAt(i));
				}else {
					if(valor.charAt(i) == ')') {
						if(!pilha.isEmpty()) {
							pilha.pop();
							if(valor.charAt(i) != ')') {
								flag = false;
								break;
							}
						}else {
							flag = false;
							break;
						}
					}
				}
			}
			
			if(pilha.isEmpty()) {
				System.out.println(flag ? "correct" : "incorrect");
			}else {
				System.out.println("incorrect");
			}
			
		}
	}
}
