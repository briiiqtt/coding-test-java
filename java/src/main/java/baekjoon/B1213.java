package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1213 {
    public static void main(String[] args) throws IOException {
        char[] line = new BufferedReader(new InputStreamReader(System.in)).readLine().toCharArray();
        int[] cnt = new int[26];
        for (int i = 0; i < line.length; i++) {
            int j = line[i] - 'A';
            cnt[j]++;
        }

        StringBuilder sb = new StringBuilder();
        char odd = '\0';
        for (int i = 0; i < 26; i++) {
            char c = (char) ('A' + i);
            if (cnt[i] % 2 != 0) {
                if (odd != '\0') {
                    System.out.println("I'm Sorry Hansoo");
                    return;
                }

                odd = c;
            }

            for (int j = 0; j < cnt[i] / 2; j++) {
                sb.append(c);
            }
        }
        StringBuilder sb2 = new StringBuilder(sb);
        if (odd != '\0') sb.append(odd);
        sb.append(sb2.reverse());

        System.out.println(sb);
    }
}
