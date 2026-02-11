package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2609_GCDLCM {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int gcd = gcd(a, b);
        int lcm = lcm(a, b, gcd);

        System.out.println(gcd);
        System.out.println(lcm);
    }

    public static int gcd(int a, int b) {
        if (a == 0) return b;
        if (b == 0) return a;
        int r = a % b;
        return gcd(b, r);
    }

    public static int lcm(int a, int b, int gcd) {
        return a * b / gcd;
    }
}
