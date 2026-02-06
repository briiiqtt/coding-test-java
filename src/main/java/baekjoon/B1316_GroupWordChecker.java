package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1316_GroupWordChecker {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int lineCount = Integer.parseInt(br.readLine());

        int count = lineCount;
        for (int i = 0; i < lineCount; i++) {
            String line = br.readLine();
            boolean[] arr = new boolean[26];

            for (int j = 0; j < line.length(); j++) {
                char prevChar = j == 0 ? ' ' : line.charAt(j - 1);
                if (prevChar != line.charAt(j)) {
                    int idx = line.charAt(j) - 'a';
                    if (arr[idx]) {
                        count--;
                        break;
                    } else {
                        arr[idx] = true;
                    }
                }
            }
        }

        System.out.println(count);
    }
}
