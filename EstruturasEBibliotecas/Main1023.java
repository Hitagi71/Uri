package EstruturasEBibliotecas;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;

public class Main1023 {
	public static void main(String[] args) throws Exception{
		DecimalFormat df = new DecimalFormat("0.00");
		df.setRoundingMode(RoundingMode.DOWN);
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int cidades = 0;
		while(true) {
			int n = Integer.parseInt(in.readLine());
			
			if(n == 0) {
				break;
			}
			
			if(cidades > 0) {
				System.out.println();
			}
			
			ArrayList<Casa> casas = new ArrayList<Casa>(); 
			String line;
			for (int i = 0; i < n; i++) {
				line = in.readLine();
				int pessoas = Integer.valueOf(line.split(" ")[0]);
				int consumo = Integer.valueOf(line.split(" ")[1]);
				casas.add(new Casa(pessoas, consumo));
			}
			
			Collections.sort(casas);
			StringBuilder answer = new StringBuilder("");
			answer.append("Cidade# "+(++cidades)+":\n");
			
			double totalPessoa = 0;
			double totalConsumo = 0;
			
			for (int i = 0; i < casas.size() ; i++) {
				if(i+1 < casas.size() && casas.get(i+1).consumoP == casas.get(i).consumoP) {
					casas.get(i+1).pessoas += casas.get(i).pessoas;
				}else {
					answer.append(casas.get(i).pessoas + "-" + casas.get(i).consumoP+" ");
					totalPessoa += casas.get(i).pessoas;
				}
				
				
				totalConsumo += casas.get(i).consumo;
			}
			
			double media = totalConsumo/totalPessoa;
			answer.deleteCharAt(answer.length() - 1);
			answer.append("\nConsumo medio: "+df.format(media).replace(",", ".")+" m3.");
			
			System.out.println(answer);
			
		}
		in.close();
	}
	
}

class Casa implements Comparable<Casa>{
	int pessoas;
	int consumo;
	int consumoP;
		
	Casa(int pessoas, int consumo) {
		this.pessoas = pessoas;
		this.consumo = consumo;
		this.consumoP = consumo/pessoas;
	}

	@Override
	public int compareTo(Casa other) {
		// TODO Auto-generated method stub
		return Double.compare(this.consumoP,other.consumoP);
	}
	
}
