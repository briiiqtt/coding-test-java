package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B4592 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (sb.length() > 0) sb.append("\n");
            StringTokenizer st = new StringTokenizer(br.readLine());
            String first = st.nextToken();
            if (first.equals("0")) break;

            int N = Integer.parseInt(first);

            String prev = null;
            for (int i = 0; i < N; i++) {
                String s = st.nextToken();
                if (prev != null && prev.equals(s)) continue;
                sb.append(s).append(" ");
                prev = s;
            }
            sb.append("$");
        }
        System.out.println(sb);
    }
}
