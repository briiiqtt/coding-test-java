package baekjoon.silver5;

import java.util.Scanner;

public class B1436_MovieDirectorShom {
    public static void main(String[] args) {
        int N = new Scanner(System.in).nextInt();
        int cnt = 0;

        int i;
        for (i = 0; cnt < N; i++) {
            if ((i + "").contains("666")) {
                ++cnt;
            }
        }

        System.out.println(i - 1);
    }
}
