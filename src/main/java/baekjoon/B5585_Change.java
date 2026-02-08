package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B5585_Change {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int change = 1000 - Integer.parseInt(br.readLine());

        int count = 0;
        while (change > 0) {
            if (change >= 500) {
                count++;
                change -= 500;
            } else if (change >= 100) {
                count++;
                change -= 100;
            } else if (change >= 50) {
                count++;
                change -= 50;
            } else if (change >= 10) {
                count++;
                change -= 10;
            } else if (change >= 5) {
                count++;
                change -= 5;
            } else {
                count++;
                change -= 1;
            }
        }
        System.out.println(count);
    }
}
