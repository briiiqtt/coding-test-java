package baekjoon.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CroatianAlphabet_2941 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        String regex = "dz=|c=|c-|d-|lj|nj|s=|z=";
        line = line.replaceAll(regex, "!");

        System.out.println(line.length());
    }

}
