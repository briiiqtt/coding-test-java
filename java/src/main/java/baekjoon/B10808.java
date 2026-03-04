package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10808 {
    public static void main(String[] args) throws IOException {
        String line = new BufferedReader(new InputStreamReader(System.in)).readLine();
        int[] counts = new int[26];
        for (int i = 0; i < line.length(); i++) {
            counts[line.charAt(i) - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < counts.length; i++) {
            sb.append(counts[i]).append(" ");
        }

        System.out.println(sb);
    }
}
