package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B10610 {
    public static void main(String[] args) throws IOException {
        char[] chars = new BufferedReader(new InputStreamReader(System.in)).readLine().toCharArray();

        String result = f(chars);

        System.out.println(result);
    }

    static String f(char[] chars) {
        int sum = 0;
        boolean hasZero = false;

        for (int i = 0; i < chars.length; i++) {
            int num = chars[i] - '0';
            sum += num;
            if (num == 0) hasZero = true;
        }
        if (!hasZero || sum % 3 != 0) {
            return "-1";
        }

        Arrays.sort(chars);
        StringBuilder sb = new StringBuilder();
        for (int i = chars.length - 1; i >= 0; i--) {
            sb.append(chars[i]);
        }
        return sb.toString();
    }
}
