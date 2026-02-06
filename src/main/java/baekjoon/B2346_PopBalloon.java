package baekjoon;
/*
자료구조: 덱
시간복잡도: O(N^2)
공간복잡도: O(N)
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class B2346_PopBalloon {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        var st = new StringTokenizer(br.readLine());

        var deque = new ArrayDeque<Balloon>();
        for (int i = 1; i <= N; i++) {
            deque.offerLast(new Balloon(i, Integer.parseInt(st.nextToken())));
        }

        var sb = new StringBuilder();
        while (!deque.isEmpty()) {
            var pop = deque.pollFirst();
            sb.append(pop.balloonNum).append(" ");
            if (deque.isEmpty()) break;

            int move = pop.paperNum > 0 ? pop.paperNum - 1 : pop.paperNum;
            for (int j = 0; j < Math.abs(move); j++) {
                if (move > 0) deque.offerLast(deque.pollFirst());
                else deque.offerFirst(deque.pollLast());
            }
        }
        System.out.println(sb);
    }

    static class Balloon {
        Balloon(int balloonNum, int paperNum) {
            this.balloonNum = balloonNum;
            this.paperNum = paperNum;
        }

        int balloonNum;
        int paperNum;
    }
}
