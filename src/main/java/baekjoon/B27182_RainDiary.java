package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B27182_RainDiary {
    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
        int n = Integer.parseInt(st.nextToken()); //today
        int m = Integer.parseInt(st.nextToken()); //two weeks ago

        if (7 < n) System.out.println(n - 7);
        else System.out.println(m + 7);
    }
}
