package baekjoon;
/*
자료구조: 배열
시간복잡도: O(N log N)
공간복잡도: O(N)
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B4779_CantorSet {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        StringBuilder sb = new StringBuilder();
        while ((line = br.readLine()) != null) {
            int N = Integer.parseInt(line);
            int length = (int) Math.pow(3, N);
            char[] arr = new char[length];
            Arrays.fill(arr, '-');

            f(arr);

            for (int i = 0; i < arr.length; i++) {
                sb.append(arr[i]);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

    static void f(char[] arr) {
        divide(arr, 0, arr.length - 1);
    }

    static void divide(char[] arr, int startIdx, int endIdx) {
        int length = (endIdx - startIdx + 1) / 3;
        int midStart = startIdx + length;
        int rightStart = midStart + length;
        for (int i = midStart; i < rightStart; i++) {
            arr[i] = ' ';
        }

        if (1 < length) {
            divide(arr, startIdx, midStart - 1);
            divide(arr, rightStart, endIdx);
        }
    }
}
