package baekjoon.silver4;
/*
자료구조: Set
시간복잡도: O(N+M)
공간복잡도: O(N+M)
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class B1269_SymmetrySetDifference {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        var A = new HashSet<String>();
        var B = new HashSet<String>();

        br.readLine();
        var stA = new StringTokenizer(br.readLine());
        var stB = new StringTokenizer(br.readLine());

        while (stA.hasMoreTokens()) {
            A.add(stA.nextToken());
        }
        while (stB.hasMoreTokens()) {
            B.add(stB.nextToken());
        }

        int cnt = 0;
        for (String s : A) {
            if (!B.contains(s)) cnt += 1;
        }
        for (String s : B) {
            if (!A.contains(s)) cnt += 1;
        }

        System.out.println(cnt);
    }
}
