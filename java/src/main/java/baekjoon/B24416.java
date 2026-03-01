package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B24416 {
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        int[] cnt = new int[2];
        fib(n, cnt);
        fibo(n, cnt);
        System.out.println(cnt[0] + " " + cnt[1]);
    }

    static int fib(int n, int[] cnt) {
        if (n == 1 || n == 2) {
            cnt[0]++;
            return 1;
        }
        return fib(n - 1, cnt) + fib(n - 2, cnt);
    }

    static int fibo(int n, int[] cnt) {
        if (n <= 1) return n;
        int[] arr = new int[n];
        arr[0] = arr[1] = 1;
        for (int i = 2; i < n; i++) {
            cnt[1]++;
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[arr.length - 1];
    }

}
