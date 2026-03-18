package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B7567 {
    public static void main(String[] args) throws IOException {
        char[] chars = new BufferedReader(new InputStreamReader(System.in)).readLine().toCharArray();
        int height = 10;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i - 1] == chars[i]) {
                height += 5;
            } else {
                height += 10;
            }
        }
        System.out.println(height);
    }
}
