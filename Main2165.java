import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main2165 {
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line = in.readLine();
		System.out.println(line.length() > 140 ? "MUTE" : "TWEET");
	}
}
