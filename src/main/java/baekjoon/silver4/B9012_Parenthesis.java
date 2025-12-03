package baekjoon.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B9012_Parenthesis {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int lineCount = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < lineCount; i++) {
            int stack = 0;

            String line = br.readLine();

            for (int j = 0; j < line.length(); j++) {
                char letter = line.charAt(j);
                if (letter == '(') {
                    stack++;
                } else {
                    stack--;
                }
                if (stack < 0) break;
            }
            if (stack == 0) sb.append("YES\n");
            else sb.append("NO\n");
        }

        System.out.println(sb.toString());
    }
}
