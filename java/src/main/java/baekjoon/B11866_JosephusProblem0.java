package baekjoon;
/*
자료구조: 큐
시간복잡도: O(KN)
공간복잡도: O(N)
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class B11866_JosephusProblem0 {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        var st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        var queue = new ArrayDeque<Integer>();
        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }

        var sb = new StringBuilder("<");
        while (!queue.isEmpty()) {
            for (int i = 0; i < K - 1; i++) {
                queue.offer(queue.poll());
            }
            sb.append(queue.poll()).append(", ");
        }

        System.out.println(sb.substring(0, sb.length() - 2) + ">");
    }

}
