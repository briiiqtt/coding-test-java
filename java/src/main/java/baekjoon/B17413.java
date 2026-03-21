package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class B17413 {
    static ArrayDeque<Character> stack = new ArrayDeque<>();
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        char[] chars = new BufferedReader(new InputStreamReader(System.in)).readLine().toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c == '<' || c == ' ') {
                flushStackIntoSB();
                if (c == '<') {
                    while ((c = chars[i]) != '>') {
                        sb.append(c);
                        i++;
                    }
                }
                sb.append(c);
            } else {
                stack.push(c);
            }
        }
        flushStackIntoSB();

        System.out.println(sb);
    }

    static void flushStackIntoSB() {
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
    }
}
