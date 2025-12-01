package baekjoon.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudyingWords_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        int[] counts = new int[26];
        for (int i = 0; i < line.length(); i++) {
            char c = Character.toUpperCase(line.charAt(i));
            counts[c - 'A']++;
        }

        char ret = 'A';
        int max = 0;
        for (int i = 0; i < counts.length; i++) {
            if (max < counts[i]) {
                max = counts[i];
                ret = (char) (i + 'A');
            } else if (max == counts[i]) {
                ret = '?';
            }
        }

        System.out.println(Character.toUpperCase(ret));
    }
}
