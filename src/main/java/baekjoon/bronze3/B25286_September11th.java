package baekjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B25286_September11th {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] days = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            if (sb.length() > 0) sb.append("\n");

            StringTokenizer st = new StringTokenizer(br.readLine());
            int y = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            m -= 1;
            if (m < 1) {
                y--;
                m = 12;
            }

            int d;
            if (m == 2 && (y % 400 == 0 || (y % 100 != 0 && y % 4 == 0))) {
                d = 29;
            } else {
                d = days[m - 1];
            }

            sb.append(y).append(" ").append(m).append(" ").append(d);
        }
        System.out.println(sb);
    }
}
