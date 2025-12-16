package baekjoon.bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1978_FindingPrimeNumbers {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        var st = new StringTokenizer(br.readLine());

        int cnt = 0;
        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            for (int i = 2; i <= num; ++i) {
                if (i == num) {
                    ++cnt;
                } else if (num % i == 0) {
                    break;
                }
            }
        }

        System.out.println(cnt);
    }
}
