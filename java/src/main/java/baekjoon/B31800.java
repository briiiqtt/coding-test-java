package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B31800 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] profits = new int[N];
        int profitMax = 0;
        int profitSecondMax = 0;
        for (int i = 0; i < N; i++) {
            profits[i] = Integer.parseInt(st.nextToken());
            if (profitMax < profits[i]) {
                profitSecondMax = profitMax;
                profitMax = profits[i];
            } else if (profitSecondMax < profits[i]) {
                profitSecondMax = profits[i];
            }
        }
        st = new StringTokenizer(br.readLine());
        /*int[] prices = new int[N];
        for (int i = 0; i < N; i++) {
            prices[i] = Integer.parseInt(st.nextToken());
        }*/

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            int pureProfit = profits[i] == profitMax ? profits[i] - profitSecondMax : profits[i] - profitMax;
            sb.append(pureProfit).append(" ");
        }

        System.out.println(sb);
    }
}
