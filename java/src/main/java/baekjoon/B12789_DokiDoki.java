package baekjoon;
/*
자료구조: 스택
시간복잡도: O(N)
공간복잡도: O(N)
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class B12789_DokiDoki {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        var st = new StringTokenizer(br.readLine());
        var stack = new ArrayDeque<Integer>();

        int seq = 1;
        for (int i = 0; i < N; i++) {
            int next = Integer.parseInt(st.nextToken());
            while (!stack.isEmpty() && stack.peek() == seq) {
                stack.pop();
                seq += 1;
            }
            if (next != seq) {
                stack.push(next);
            } else {
                seq += 1;
            }
        }

        System.out.println(stack.isEmpty() ? "Nice" : "Sad");
    }
}
