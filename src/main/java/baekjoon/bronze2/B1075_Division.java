package baekjoon.bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1075_Division {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int F = Integer.parseInt(br.readLine());

        int n = N / 100 * 100;

        while (n % F != 0) {
            n++;
        }

        System.out.println(String.format("%02d", n % 100));
    }
}
