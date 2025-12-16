package baekjoon.bronze3;
/*
IF Y % X == 0: print('factor')
ELSE IF X % Y == 0: print('multiple')
ELSE print('neither')
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B5086_MultiplesAndDivisors {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        var sb = new StringBuilder();

        String line;
        while ((line = br.readLine()) != null) {
            var t = line.split(" ");
            int X = Integer.parseInt(t[0]);
            int Y = Integer.parseInt(t[1]);

            if (X == 0 && Y == 0) {
                break;
            } else if (X != 0 && Y % X == 0) {
                sb.append("factor\n");
            } else if (Y != 0 && X % Y == 0) {
                sb.append("multiple\n");
            } else {
                sb.append("neither\n");
            }
        }
        System.out.println(sb);
    }
}
