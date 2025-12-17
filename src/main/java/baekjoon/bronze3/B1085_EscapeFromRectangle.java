package baekjoon.bronze3;
/*
x, y
w, h

x, w-x, y, h-y 중 가장 작은 값 찾기
 */

import java.io.IOException;
import java.util.Scanner;

public class B1085_EscapeFromRectangle {
    public static void main(String[] args) throws IOException {
        var sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        int min = Math.min(x, y);
        min = Math.min(min, w - x);
        min = Math.min(min, h - y);

        System.out.println(min);
    }
}
