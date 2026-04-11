package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B5598 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = br.readLine().toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            sb.append(decode(chars[i]));
        }
        System.out.println(sb);
    }

    static char decode(char c) {
        return (char) ('A' + ((c - 'A' - 3 + 26) % 26));
    }
}
