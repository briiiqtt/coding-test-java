package baekjoon;
/*
교차할 수 없다는 걸 복잡하게 생각했다.
만약
N1  M1
N2  M2
    M3
사이트가 이렇게 있을 때, M에서 N개를 뽑아보겠다.
[N1->M1, N2->M2] 로 다리를 연결하는 건 가능하다. 이 경우는 M1, M2가 뽑힌 경우이다.
[N1->M2, N2->M1] 로 다리를 연결하는 건 다리가 교차되기 때문에 불가능하다. 그러나 이 경우도 M1, M2가 뽑힌 경우로 위와 같다.
결국 그냥 MCN 이라는 말이다.
다리 교차를 허용하면 MPN 이다.
순서가 강제된다 = 순서에 상관없이 뽑기만 하는 경우의 수
순서가 자유롭다 = 순서가 다른 경우를 별개로 세는 경우의 수
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1010_LayBridge {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        var sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            var st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            long p = 1;
            for (int j = 0; j < N; j++) {
                p *= M - j;
                p /= j + 1;
            }

            sb.append(p).append("\n");
        }
        System.out.println(sb);
    }
}