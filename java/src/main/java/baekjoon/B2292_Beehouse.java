package baekjoon;
/*
시간복잡도: O(
수도코드:
```
0 1 3 6 10 15
0 6 18 36 60 90
N = readInt()

max = 1
layer = 1
WHILE N > max:
    max += 6 * layer
    layer++
ENDWHILE

print(i)
```
 */

import java.util.Scanner;

public class B2292_Beehouse {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int N = sc.nextInt();

        int max = 1;
        int layer = 1;
        while (N > max) {
            max += 6 * layer;
            layer++;
        }

        System.out.println(layer);
    }
}
