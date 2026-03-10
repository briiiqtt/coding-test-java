package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1032 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] lines = new String[Integer.parseInt(br.readLine())];
        for (int i = 0; i < lines.length; i++) {
            lines[i] = br.readLine();
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < lines[0].length(); i++) {
            char c = lines[0].charAt(i);
            for (int j = 1; j < lines.length; j++) {
                if (lines[j].charAt(i) != c) {
                    c = '?';
                    break;
                }
            }
            sb.append(c);
        }

        System.out.println(sb);
    }
}
