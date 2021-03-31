package AD_HOC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Uri1121 {
    public static void main(String[] args) throws IOException {
        /*
            3 3 2                           0
            ***                             1
            *N*                             3
            ***
            DE
            4 4 5
            ...#
            *#O.
            *.*.
            *.#.
            FFEFF
            10 10 20
            ....*.....
            .......*..
            .....*....
            ..*.#.....
            ...#N.*..*
            ...*......
            ..........
            ..........
            ..........
            ..........
            FDFFFFFFEEFFFFFFEFDF
            0 0 0

            for (int i = 0; i < n ; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(arena[i][j]);
                }
                System.out.println();
            }
         */

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while((line = in.readLine()) != null && !line.isEmpty()) {
            int n = Integer.parseInt(line.split(" ")[0]);
            int m = Integer.parseInt(line.split(" ")[1]);
            int s = Integer.parseInt(line.split(" ")[2]);

            char movimento[] = new char[s];
            char arena[][] = new char[n][m];

            for (int i = 0; i < n ; i++) {
                line = in.readLine();
                for (int j = 0; j < m; j++) {
                    arena[i][j] = line.charAt(j);
                }
            }

            line = in.readLine();
            for (int i = 0; i < s; i++) {
                movimento[i] = line.charAt(i);
            }


        }
    }
}
