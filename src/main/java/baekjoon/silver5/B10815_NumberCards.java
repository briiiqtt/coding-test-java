package baekjoon.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

/*
자료구조: Set
시간복잡도: O(N+M)
공간복잡도: O(N)
 */
public class B10815_NumberCards {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        var st1 = new StringTokenizer(br.readLine());
        br.readLine();
        var st2 = new StringTokenizer(br.readLine());

        var set = new HashSet<String>();
        while (st1.hasMoreTokens()) {
            set.add(st1.nextToken());
        }

        var sb = new StringBuilder();
        while (st2.hasMoreTokens()) {
            sb.append(set.contains(st2.nextToken()) ? '1' : '0').append(" ");
        }

        System.out.println(sb);
    }
}
