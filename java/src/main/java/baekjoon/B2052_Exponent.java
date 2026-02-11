package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class B2052_Exponent {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        BigDecimal r = new BigDecimal(1);
        BigDecimal a = new BigDecimal(2).pow(N);
        r = r.divide(a);

        System.out.println(r.toPlainString());
    }
}

