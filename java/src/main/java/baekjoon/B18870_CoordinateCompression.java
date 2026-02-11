package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class B18870_CoordinateCompression {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] inputArr = new int[N];
        int[] sortArr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            inputArr[i] = Integer.parseInt(st.nextToken());
            sortArr[i] = inputArr[i];
        }

        Arrays.sort(sortArr);

        HashMap<Integer, Integer> map = new HashMap<>();
        int seq = 0;
        for (int i : sortArr) {
            if (!map.containsKey(i)) map.put(i, seq++);
        }

        var sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(map.get(inputArr[i])).append(" ");
        }

        System.out.println(sb);
    }
}
