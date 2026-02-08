package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B3943_Hailstone {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());


        for (int i = 0; i < T; i++) {
            if (0 < sb.length()) sb.append("\n");
            int n = Integer.parseInt(br.readLine());
            int max = n;

            while (n != 1) {
                if (n % 2 == 0) {
                    n /= 2;
                } else {
                    n = n * 3 + 1;
                }
                if (max < n) max = n;
            }
            sb.append(max);
        }

        System.out.println(sb);
    }
}
