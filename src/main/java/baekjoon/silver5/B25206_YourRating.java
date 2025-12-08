package baekjoon.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B25206_YourRating {
    /*
    자료구조: 정수
    시간복잡도: O(N)
    공간복잡도: O(1)
    수도코드:
    ```
    int avg;
    int cnt;
    for (0..19)
        String[] tokens = tokenize(read());
        if (tokens[2] != "P")
            avg += toInt(tokens[1]);
            cnt++;

    print((float)avg / cnt);
    ```
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        float numerator = 0;
        float denominator = 0;
        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            st.nextToken();
            float p = Float.parseFloat(st.nextToken());
            String r = st.nextToken();

            if (!r.equals("P")) {
                denominator += p;
                numerator += p * f(r);
            }
        }

        System.out.println(numerator / denominator);
    }

    public static float f(String rating) {
        switch (rating) {
            case "A+":
                return 4.5F;
            case "A0":
                return 4F;
            case "B+":
                return 3.5F;
            case "B0":
                return 3F;
            case "C+":
                return 2.5F;
            case "C0":
                return 2F;
            case "D+":
                return 1.5F;
            case "D0":
                return 1F;
            case "F+":
            default:
                return 0F;
        }
    }
}
