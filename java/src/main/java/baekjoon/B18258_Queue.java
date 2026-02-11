package baekjoon;
/*
자료구조: 큐
시간복잡도: O(N)
공간복잡도: O(N)
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class B18258_Queue {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        var queue = new ArrayDeque<String>();
        var sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            switch (line) {
                case "pop": {
                    sb.append(queue.isEmpty() ? -1 : queue.pop()).append("\n");
                    break;
                }
                case "size": {
                    sb.append(queue.size()).append("\n");
                    break;
                }
                case "empty": {
                    sb.append(queue.isEmpty() ? 1 : 0).append("\n");
                    break;
                }
                case "front": {
                    sb.append(queue.isEmpty() ? -1 : queue.peek()).append("\n");
                    break;
                }
                case "back": {
                    sb.append(queue.isEmpty() ? -1 : queue.getLast()).append("\n");
                    break;
                }
                default: {
                    queue.addLast(line.split(" ")[1]);
                }
            }
        }

        System.out.println(sb);
    }
}
