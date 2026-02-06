package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B2587_RepresentativeValue {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            int a = Integer.parseInt(br.readLine());
            sum += a;
            arr[i] = a;
        }
        Arrays.sort(arr);

        System.out.print(sum / 5 + "\n" + arr[2]);
    }
}
