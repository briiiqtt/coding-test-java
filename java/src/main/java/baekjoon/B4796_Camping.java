package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B4796_Camping {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        String line;
        int i = 0;
        while (!(line = br.readLine()).equals("0 0 0")) {
            if (sb.length() > 0) sb.append("\n");

            StringTokenizer st = new StringTokenizer(line);
            int L = Integer.parseInt(st.nextToken()), P = Integer.parseInt(st.nextToken()), V = Integer.parseInt(st.nextToken());

            int n = (V / P) * L + Math.min(L, V % P);

            sb.append("Case ").append(++i).append(": ").append(n);
        }
        System.out.println(sb);
    }
}
