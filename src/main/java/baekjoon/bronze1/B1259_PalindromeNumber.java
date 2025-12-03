package baekjoon.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1259_PalindromeNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line;
        while ((line = br.readLine()) != null) {
            if (line.equals("0")) return;

            char[] arr = new char[line.length()];

            for (int i = 0; i < line.length(); i++) {
                arr[line.length() - 1 - i] = line.charAt(i);
            }

            String reversed = new String(arr);

            if (line.equals(reversed)) System.out.println("yes");
            else System.out.println("no");
        }
    }
}
