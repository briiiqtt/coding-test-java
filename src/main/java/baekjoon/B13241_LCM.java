package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B13241_LCM {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        var st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int x = Math.max(A, B);
        int y = Math.min(A, B);
        while (x != 0 && y != 0) {
            int r = x % y;
            x = y;
            y = r;
        }

        int gcd = Math.max(x, y);

        System.out.println((long) A / gcd * B);
    }
}
