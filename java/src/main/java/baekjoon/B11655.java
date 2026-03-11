package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B11655 {
    public static void main(String[] args) throws IOException {
        char[] chars = new BufferedReader(new InputStreamReader(System.in)).readLine().toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ('a' <= c && c <= 'z') {
                c += 13;
                if (c > 'z') c -= 26;
            } else if ('A' <= c && c <= 'Z') {
                c += 13;
                if (c > 'Z') c -= 26;
            }
            sb.append(c);
        }
        System.out.println(sb);
    }
}
