package baekjoon.bronze2;
/*
N = readStr()

for (i = 0 to toNum(N))
    sum = i.split("").sum(e => e) + i
    if (sum == N)
        print(i)
        break
    endif
endfor
 */

import java.util.Scanner;

public class B2231_Boonhaehap {
    public static void main(String[] args) {
        int N = new Scanner(System.in).nextInt();

        int answer = 0;

        for (int i = 0; i < N; i++) {
            var t = (i + "").split("");
            int sum = 0;
            for (int j = 0; j < t.length; j++) {
                sum += Integer.parseInt(t[j]);
            }
            sum += i;

            if (sum == N) {
                answer = i;
                break;
            }
        }
        System.out.println(answer);
    }
}
