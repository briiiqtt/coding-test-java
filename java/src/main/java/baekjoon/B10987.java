package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10987 {
    public static void main(String[] args) throws IOException {
        char[] chars = new BufferedReader(new InputStreamReader(System.in)).readLine().toCharArray();
        int cnt = 0;
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') cnt++;
        }
        System.out.println(cnt);
    }
}
