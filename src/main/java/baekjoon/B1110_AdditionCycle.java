package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1110_AdditionCycle {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int x = n;
        int cycle = 0;
        do {
            int a = x / 10;
            int b = x % 10;
            x = b * 10 + (a + b) % 10;
            ++cycle;
        } while (n != x);

        System.out.println(cycle);
    }
}
