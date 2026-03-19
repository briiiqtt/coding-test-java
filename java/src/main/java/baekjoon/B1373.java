package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1373 {
    public static void main(String[] args) throws IOException {
        String line = new BufferedReader(new InputStreamReader(System.in)).readLine();
        StringBuilder sb = new StringBuilder();
        int rest = line.length() % 3;
        if (rest == 2) {
            sb.append((line.charAt(0) - '0') * 2 + line.charAt(1) - '0');
        } else if (rest == 1) {
            sb.append(line.charAt(0) - '0');
        }

        for (int i = line.length() % 3; i < line.length(); i += 3) {
            sb.append((line.charAt(i) - '0') * 4 + (line.charAt(i + 1) - '0') * 2 + line.charAt(i + 2) - '0');
        }

        System.out.println(sb);
    }
}
