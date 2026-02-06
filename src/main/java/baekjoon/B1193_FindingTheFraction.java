package baekjoon;
/*
- 한 층이 늘어날 때마다 이전 층보다 한 칸씩 더 생김

---
X가 속한 층과 그 층의 최대값을 찾는다

짝수층이면
    X가 최대값에 비해 모자란 만큼 층수에서 뺀 값이 분자
    이전 층의 최대값 + 1에 비해 많은 만큼 뺀 값이 분모홀수층이면 반대로
*/

import java.io.IOException;
import java.util.Scanner;

public class B1193_FindingTheFraction {
    public static void main(String[] args) throws IOException {
        int XthNum = new Scanner(System.in).nextInt();
        int layer = 1, maxValInLayer = 1;

        while (XthNum > maxValInLayer) {
            layer++;
            maxValInLayer += layer;
        }

        int A, B;
        if (layer % 2 == 0) {
            A = layer - (maxValInLayer - XthNum);
            B = layer - (XthNum - (maxValInLayer + 1 - layer));
        } else {
            A = layer - (XthNum - (maxValInLayer + 1 - layer));
            B = layer - (maxValInLayer - XthNum);
        }

        System.out.println(A + "/" + B);
    }
}