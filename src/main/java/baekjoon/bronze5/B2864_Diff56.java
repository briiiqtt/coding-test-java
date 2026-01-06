package baekjoon.bronze5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2864_Diff56 {
    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
        String A = st.nextToken();
        String B = st.nextToken();
        int minA = Integer.parseInt(A.replaceAll("6", "5"));
        int maxA = Integer.parseInt(A.replaceAll("5", "6"));
        int minB = Integer.parseInt(B.replaceAll("6", "5"));
        int maxB = Integer.parseInt(B.replaceAll("5", "6"));
        System.out.println(minA + minB + " " + (maxA + maxB));
    }
}
