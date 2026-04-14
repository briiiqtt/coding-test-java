package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B4659 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String line;
        StringBuilder sb = new StringBuilder();
        while (!(line = br.readLine()).equals("end")) {
            char[] chars = line.toCharArray();
            int aeiouCount = 0;
            boolean suc = false;
            boolean suc2 = false;
            for (int i = 0; i < chars.length; i++) {
                char c = chars[i];
                if (isAeiou(c)) aeiouCount++;
                if (i > 1) {
                    boolean[] b = new boolean[]{isAeiou(c), isAeiou(chars[i - 1]), isAeiou(chars[i - 2])};
                    suc = b[0] == b[1] && b[1] == b[2];
                    if (suc) break;
                }
                if (i > 0 && c == chars[i - 1] && c != 'e' && c != 'o') {
                    suc2 = true;
                    break;
                }
            }
            boolean acceptable = aeiouCount > 0 && !suc && !suc2;
            sb.append(String.format("<%s> is%s acceptable.\n", line, acceptable ? "" : " not"));
        }
        System.out.println(sb);
    }

    static boolean isAeiou(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
