package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1264 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        StringBuilder sb = new StringBuilder();
        char[] aeious = new char[]{'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        while (!(line = br.readLine()).equals("#")) {
            int cnt = 0;
            char[] chars = line.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                for (int j = 0; j < aeious.length; j++) {
                    if (chars[i] == aeious[j]) {
                        cnt++;
                        break;
                    }
                }
            }
            sb.append(cnt).append("\n");
        }
        System.out.println(sb);
    }
}
