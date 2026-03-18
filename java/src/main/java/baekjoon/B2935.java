package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B2935 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] A = br.readLine().toCharArray();
        String operator = br.readLine();
        char[] B = br.readLine().toCharArray();

        if (operator.equals("+")) {
            if (A.length == B.length) {
                A[0] = '2';
            } else if (A.length > B.length) {
                A[A.length - B.length] = '1';
            } else {
                B[B.length - A.length] = '1';
                A = B;
            }
        } else {
            A = new char[A.length + B.length - 1];
            Arrays.fill(A, '0');
            A[0] = '1';
        }

        System.out.println(new String(A));
    }
}
