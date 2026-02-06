package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B5355_MartianMath {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            if (sb.length() > 0) sb.append("\n");

            StringTokenizer st = new StringTokenizer(br.readLine());
            double n = Double.parseDouble(st.nextToken());
            while (st.hasMoreTokens()) {
                switch (st.nextToken()) {
                    case "@":
                        n *= 3;
                        break;
                    case "%":
                        n += 5;
                        break;
                    case "#":
                        n -= 7;
                        break;
                }
            }
            sb.append(String.format("%.2f", n));
        }
        System.out.println(sb);
    }
}
