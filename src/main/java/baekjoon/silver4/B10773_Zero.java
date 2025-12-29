package baekjoon.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class B10773_Zero {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());

        var stack = new ArrayDeque<Integer>();

        int sum = 0;
        for (int i = 0; i < K; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0) {
                sum -= stack.removeFirst();
            } else {
                sum += num;
                stack.addFirst(num);
            }
        }

        System.out.println(sum);
    }
}
