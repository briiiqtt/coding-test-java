package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1120 {
    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
        char[] line1 = st.nextToken().toCharArray();
        char[] line2 = st.nextToken().toCharArray();

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < line2.length - line1.length + 1; i++) {
            int cnt = 0;
            for (int j = 0; j < line1.length; j++) {
                if (line1[j] != line2[i + j]) cnt++;
            }
            if (min > cnt) min = cnt;
        }

        System.out.println(min);
    }
}
