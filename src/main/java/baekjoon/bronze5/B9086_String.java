package baekjoon.bronze5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B9086_String {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int lineCount = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < lineCount; i++) {
            String line = br.readLine();
            sb.append(line.charAt(0)).append(line.charAt(line.length() - 1)).append("\n");
        }

        System.out.println(sb);
    }
}
