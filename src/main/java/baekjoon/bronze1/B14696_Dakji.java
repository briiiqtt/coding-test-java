package baekjoon.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B14696_Dakji {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int star = 4, circle = 3, square = 2, triangle = 1;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            int[] cardA = new int[5];
            int[] cardB = new int[5];

            StringTokenizer stA = new StringTokenizer(br.readLine());
            int countA = Integer.parseInt(stA.nextToken());
            for (int j = 0; j < countA; j++) {
                int shape = Integer.parseInt(stA.nextToken());
                cardA[shape]++;
            }

            StringTokenizer stB = new StringTokenizer(br.readLine());
            int countB = Integer.parseInt(stB.nextToken());
            for (int j = 0; j < countB; j++) {
                int shape = Integer.parseInt(stB.nextToken());
                cardB[shape]++;
            }

            String result = "D";
            if (cardA[star] != cardB[star]) {
                if (cardA[star] < cardB[star]) result = "B";
                else result = "A";
            } else if (cardA[circle] != cardB[circle]) {
                if (cardA[circle] < cardB[circle]) result = "B";
                else result = "A";
            } else if (cardA[square] != cardB[square]) {
                if (cardA[square] < cardB[square]) result = "B";
                else result = "A";
            } else if (cardA[triangle] != cardB[triangle]) {
                if (cardA[triangle] < cardB[triangle]) result = "B";
                else result = "A";
            }
            sb.append(result).append("\n");
        }
        System.out.println(sb);
    }
}
