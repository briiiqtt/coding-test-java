package baekjoon;

import java.io.IOException;
import java.util.Scanner;

public class B19532_VirtualMathClass {
    public static void main(String[] args) throws IOException {
        var sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt(), e = sc.nextInt(), f = sc.nextInt();


        int x = -999, y = -999;
        boolean found = false;
        for (; x < 1000; x++) {
            for (y = -999; y < 1000; y++) {
                if (a * x + b * y == c && d * x + e * y == f) {
                    found = true;
                    break;
                }
            }
            if (found) break;
        }

        System.out.print(x + " " + y);
    }
}
