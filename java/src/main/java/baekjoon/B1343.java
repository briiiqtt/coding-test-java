package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1343 {
    public static void main(String[] args) throws IOException {
        char[] line = new BufferedReader(new InputStreamReader(System.in)).readLine().toCharArray();
        int cnt = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < line.length; i++) {
            char c = line[i];
            if (c == '.' && cnt > 0 || i == line.length-1) {
                if (cnt % 2 != 0) {
                    System.out.println(-1);
                    return;
                }
                for (int j = 0; j < cnt / 4; j++) {
                    sb.append("AAAA");
                }
                if (cnt % 4 == 2) sb.append("BB");

                sb.append('.');
            } else if (c == '.') {
                sb.append(c);
            } else if (c == 'X') cnt++;
        }
        System.out.println(sb);
    }
}
