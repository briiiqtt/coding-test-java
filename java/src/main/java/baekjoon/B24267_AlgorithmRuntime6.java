package baekjoon;

import java.util.Scanner;

public class B24267_AlgorithmRuntime6 {
    public static void main(String[] args) {
        long n = new Scanner(System.in).nextLong();

        // nC3
        System.out.println((n * (n - 1) * (n - 2)) / 6);
        System.out.println(3);
    }
}
