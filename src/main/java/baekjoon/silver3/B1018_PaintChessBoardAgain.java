package baekjoon.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
좌표 x=0, y=0 부터 x=N, y=M까지
x+7, y+7까지 64글자를 배열에 담는다

BWBW로 시작할 경우와 WBWB로 시작할 경우 각각 글자가 일치하지 않는 수 중 작은 값을 기록한다
 */
public class B1018_PaintChessBoardAgain {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        var st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String[] lines = new String[N];
        for (int i = 0; i < N; i++) {
            lines[i] = br.readLine();
        }

        int minChange = 64;
        for (int x = 0; x < N - 7; x++) {
            for (int y = 0; y < M - 7; y++) {
                int wbChange = 0;
                int bwChange = 0;
                for (int i = x; i < x + 8; i++) {
                    for (int j = y; j < y + 8; j++) {
                        char c = lines[i].charAt(j);

                        if ((i + j) % 2 == 0) {
                            if (c == 'B') ++wbChange;
                            else ++bwChange;
                        } else {
                            if (c != 'B') ++wbChange;
                            else ++bwChange;
                        }
                    }
                }
                if (minChange > wbChange) minChange = wbChange;
                if (minChange > bwChange) minChange = bwChange;
            }
        }

        System.out.println(minChange);
    }
}
