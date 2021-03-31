package Iniciante;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main2029 {
	public static void main(String[] args) throws IOException {
		DecimalFormat df=new DecimalFormat("0.00");
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		
		String line;
		while((line = in.readLine()) != null) {
			double volume = Double.parseDouble(line);
			double diametro = Double.parseDouble(in.readLine());
	    	
	    	double area = 3.14*Math.pow(diametro/2, 2);
	    	double altura = volume/area;
	    	
	    	
	    	System.out.println("ALTURA = "+df.format(altura));
	    	System.out.println("AREA = "+df.format(area));
		}
	}
}
