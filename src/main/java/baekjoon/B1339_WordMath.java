package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class B1339_WordMath {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[26];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < line.length(); j++) {
                int idx = line.charAt(j) - 'A';
                arr[idx] += (int) Math.pow(10, (line.length() - 1 - j));
            }
        }

        Arrays.sort(arr);

        int result = 0;
        for (int i = arr.length - 1; i > arr.length - 10; i--) { // 25 ~ 17
            result += arr[i] * (i - 16);
        }

        System.out.println(result);
    }
}
