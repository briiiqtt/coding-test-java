package baekjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10872_Factorial {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int fac = 1;
        for (int i = 2; i <= N; i++) {
            fac *= i;
        }

        System.out.println(fac);
    }
}
