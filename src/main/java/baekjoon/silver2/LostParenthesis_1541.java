package baekjoon.silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LostParenthesis_1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        int result = 0;
        int temp = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if (c != '+' && c != '-') {
                sb.append(c);
            } else {
                int n = Integer.parseInt(sb.toString());

            }
        }
    }
}
