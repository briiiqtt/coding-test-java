package baekjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B3009_FourthDot {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));

        /*
        XOR
        이걸 쓸 수 있는 경우는
        1. 등장 횟수가 홀/짝으로만 나뉘면 되는 경우
        2. 찾으려는 값이 다른 요소들에 반해 유일하게 홀수번 혹은 짝수번 등장하는게 보장되는 경우
         */

        int x = 0;
        int y = 0;

        for (int i = 0; i < 3; i++) {
            var st = new StringTokenizer(br.readLine());
            x ^= Integer.parseInt(st.nextToken());
            y ^= Integer.parseInt(st.nextToken());
        }

        System.out.println(x + " " + y);
    }
}
