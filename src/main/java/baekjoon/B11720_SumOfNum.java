package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B11720_SumOfNum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());

        int sum = 0;
        String line = br.readLine();

        for (int i = 0; i < cnt; i++) {
            sum += line.charAt(i) - 48;
        }

        System.out.println(sum);
    }
}
