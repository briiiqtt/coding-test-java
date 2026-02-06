package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B32326_ConveyorBeltSushi {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int priceRed = 3, priceGreen = 4, priceBlue = 5;
        int R = Integer.parseInt(br.readLine());
        int G = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        System.out.println(R * priceRed + G * priceGreen + B * priceBlue);
    }
}
