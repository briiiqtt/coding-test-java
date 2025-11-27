package baekjoon.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DigitSort3_10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int lineCount = Integer.parseInt(br.readLine());

        int[] countingArr = new int[10001]; // 이 문제에선 최대값이 10000이므로 0~10000이면 [10001]
        // '카운팅배열의 인덱스'와 '요소의 값'을 맞추는게 직관적임. (들어오는 값에 0이 없어서 0번 인덱스가 의미없어질지라도)

        for (int i = 0; i < lineCount; i++) {
            int num = Integer.parseInt(br.readLine());
            countingArr[num]++; // 원본데이터를 별개의 배열에 저장할 필요가 없다.
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < countingArr.length; i++) {
            while (countingArr[i]-- > 0) {
                sb.append(i).append("\n");
            }
        }

        System.out.print(sb.toString());
    }
}
