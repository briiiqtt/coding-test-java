package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B16917_YangbanHooban {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());

        int rest = Math.abs(X - Y);
        int common = Math.max(X, Y) - rest;

        int price = 0;

        if (A + B > C * 2) price += common * C * 2;
        else price += common * A + common * B;

        if (X > Y) {
            if (A > C * 2) price += rest * C * 2;
            else price += rest * A;
        } else {
            if (B > C * 2) price += rest * C * 2;
            else price += rest * B;
        }

        System.out.println(price);
    }
}
