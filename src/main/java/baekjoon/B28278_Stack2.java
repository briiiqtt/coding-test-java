package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class B28278_Stack2 {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        var stack = new ArrayDeque<String>();
        var sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            String line = br.readLine();

            switch (line.charAt(0)) {
                case '1':
                    stack.addFirst(line.split(" ")[1]);
                    break;
                case '2':
                    if (stack.isEmpty()) sb.append(-1).append("\n");
                    else sb.append(stack.removeFirst()).append("\n");
                    break;
                case '3':
                    sb.append(stack.size()).append("\n");
                    break;
                case '4':
                    sb.append(stack.isEmpty() ? 1 : 0).append("\n");
                    break;
                case '5':
                    if (stack.isEmpty()) sb.append(-1).append("\n");
                    else sb.append(stack.getFirst()).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}
