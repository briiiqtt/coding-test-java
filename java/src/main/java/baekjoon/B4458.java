package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B4458 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            char[] chars = br.readLine().toCharArray();
            if (chars[0] >= 'a') chars[0] = (char) (chars[0] - 32);
            sb.append(new String(chars)).append("\n");
        }
        System.out.println(sb);
    }
}
