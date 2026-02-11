package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class B4949_BalancedWorld {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String line;
        while (!(line = br.readLine()).equals(".")) {
            ArrayDeque<Character> deque = new ArrayDeque<>();

            int i = 0;
            for (; i < line.length(); i++) {
                char c = line.charAt(i);

                if (c == '(' || c == '[') deque.push(c);
                else if (c == ')' && (deque.isEmpty() || deque.pop() != '(')) break;
                else if (c == ']' && (deque.isEmpty() || deque.pop() != '[')) break;
            }

            if (i == line.length() && deque.isEmpty()) sb.append("yes");
            else sb.append("no");
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
