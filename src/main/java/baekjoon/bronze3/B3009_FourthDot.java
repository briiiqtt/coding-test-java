package baekjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class B3009_FourthDot {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));

        int[] x = new int[3];
        int[] y = new int[3];

        for (int i = 0; i < 3; i++) {
            var st = new StringTokenizer(br.readLine());
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }

        int newX = x[0];
        int newY = y[0];

        if (x[0] == x[1]) newX = x[2];
        else if (x[0] == x[2]) newX = x[1];

        if (y[0] == y[1]) newY = y[2];
        else if (y[0] == y[2]) newY = y[1];

        System.out.println(newX + " " + newY);
    }
}
