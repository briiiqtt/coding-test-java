package baekjoon;

import java.util.Scanner;

public class B24265_AlgorithmRuntime4 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        System.out.println((long) n * (n - 1) / 2 + "\n" + 2);
    }
}

