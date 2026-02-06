package baekjoon;

import java.util.Scanner;

public class B14215_ThreeSticks {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = Math.max(a, Math.max(b, c));
        int temp = max;
        if ((a + b + c - max) <= max) temp = (a + b + c - max) - 1;

        System.out.println(a + b + c - (max - temp));
    }
}
