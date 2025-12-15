package baekjoon.bronze1;
/*
A, B, V = read()

day = 1
WHILE day * A - (day - 1) * B < V:
    day++
ENDWHILE

d = day
V <= Ad - B(d - 1)
V <= Ad - Bd + B
V <= d(A-B) + B
V-B <= d(A-B)
(V-B) / (A-B) <= d

print(day)
 */

import java.io.IOException;
import java.util.Scanner;

public class B2869_Snail {
    public static void main(String[] args) throws IOException {
        var sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int V = sc.nextInt();

        int day = (int) Math.ceil((double) (V - B) / (A - B));

        System.out.println(day);
    }
}
