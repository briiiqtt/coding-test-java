package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1225 {
    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
        char[] A = st.nextToken().toCharArray();
        char[] B = st.nextToken().toCharArray();
        long result = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                int mul = (A[i] - '0') * (B[j] - '0');
                result += mul;
            }
        }
        System.out.println(result);
    }
}
