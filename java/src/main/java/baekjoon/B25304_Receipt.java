package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B25304_Receipt {
    /*
    자료구조: 4바이트 정수
    시간복잡도: O(n)
    공간복잡도: O(1)
    수도코드:
        int X = readX();
        int N = readN();

        for(N)
            a = token[0], b = token[1]
            price -= a * b

        if (price == 0) print("Yes")
        else print("No")
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer tokens = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(tokens.nextToken());
            int b = Integer.parseInt(tokens.nextToken());

            X -= a * b;
        }

        if (X == 0) System.out.println("Yes");
        else System.out.println("No");
    }
}
