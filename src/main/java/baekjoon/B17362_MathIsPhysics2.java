package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B17362_MathIsPhysics2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        switch (n % 8) {
            case 1:
                System.out.println(1);
                break;
            case 2:
            case 0:
                System.out.println(2);
                break;
            case 3:
            case 7:
                System.out.println(3);
                break;
            case 4:
            case 6:
                System.out.println(4);
                break;
            case 5:
                System.out.println(5);
                break;
        }
    }
}
