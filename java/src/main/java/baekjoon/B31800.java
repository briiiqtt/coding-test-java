package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B31800 {

    public static void main(String[] args) throws IOException {
        /*
        순수익 = 이익 - (기회비용 + 가격)
        기회비용 = 자기제외최대이익 - 가격
        순수익 = 이익 - ((자기제외최대이익 - 가격) + 가격)
        순수익 = 이익 - 자기제외최대이익
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        br.readLine();

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int[] profits = new int[N];
        for (int i = 0; i < N; i++) {
            int profit = Integer.parseInt(st.nextToken());
            profits[i] = profit;
            if (max < profit) {
                secondMax = max;
                max = profit;
            } else if (secondMax < profit) {
                secondMax = profit;
            }
        }

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < N; i++) {
            if (sb.length() > 0) sb.append(" ");
            int m = profits[i] == max ? secondMax : max;
            sb.append(profits[i] - m);
        }
        System.out.println(sb);
    }
}
