package baekjoon.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class GroupWordChecker_1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int lineCount = Integer.parseInt(br.readLine());

        int count = lineCount;
        for (int i = 0; i < lineCount; i++) {
            String line = br.readLine();
            HashSet<Character> set = new HashSet<>();
            for (int j = 0; j < line.length(); j++) {
                if (j == line.length() - 1 || line.charAt(j) != line.charAt(j + 1)) {
                    if (!set.add(line.charAt(j))) {
                        count--;
                        break;
                    }
                }
            }
        }

        System.out.println(count);
    }
}
