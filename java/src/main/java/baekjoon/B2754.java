package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2754 {
    public static void main(String[] args) throws IOException {
        String line = new BufferedReader(new InputStreamReader(System.in)).readLine();
        float point = 0F;
        char a = line.charAt(0);
        if (a == 'F') {
            System.out.println(point);
            return;
        }

        char b = line.charAt(1);
        switch (a) {
            case 'A': point += 4F; break;
            case 'B': point += 3F; break;
            case 'C': point += 2F; break;
            case 'D': point += 1F; break;
        }
        switch (b) {
            case '+': point += 0.3F; break;
            case '-': point -= 0.3F; break;
        }

        System.out.println(point);
    }
}
