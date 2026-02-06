package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1735_FractionSum {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        var st1 = new StringTokenizer(br.readLine());
        var st2 = new StringTokenizer(br.readLine());

        int numerator1 = Integer.parseInt(st1.nextToken());
        int denominator1 = Integer.parseInt(st1.nextToken());
        int numerator2 = Integer.parseInt(st2.nextToken());
        int denominator2 = Integer.parseInt(st2.nextToken());

        int numerator = numerator1 * denominator2 + numerator2 * denominator1;
        int denominator = denominator1 * denominator2;

        int gcd = gcd(Math.abs(numerator), Math.abs(denominator));

        System.out.println(numerator / gcd + " " + denominator / gcd);
    }

    static int gcd(int x, int y) {
        while (y != 0) {
            int r = x % y;
            x = y;
            y = r;
        }
        return x;
    }
}
