package baekjoon.silver4;
/*
자료구조: 큐
시간복잡도: O(N)
공간복잡도: O(N)
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class B2164_Card2 {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        var queue = new ArrayDeque<Integer>();

        for (int i = 0; i < N; i++) {
            queue.offerLast(i + 1);
        }
        while (queue.size() > 1) {
            queue.poll();
            queue.offerLast(queue.pop());
        }

        System.out.println(queue.pop());
    }
}
