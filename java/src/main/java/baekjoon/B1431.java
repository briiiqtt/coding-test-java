package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class B1431 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(br.readLine());
        }
        /*
        A와 B의 길이가 다르면, 짧은 것이 먼저 온다.
        만약 서로 길이가 같다면, A의 모든 자리수의 합과 B의 모든 자리수의 합을 비교해서 작은 합을 가지는 것이 먼저온다. (숫자인 것만 더한다)
        만약 1,2번 둘 조건으로도 비교할 수 없으면, 사전순으로 비교한다. 숫자가 알파벳보다 사전순으로 작다.
         */
        list.sort((a, b) -> {
            if (a.length() == b.length()) {
                int numA = getNumSum(a);
                int numB = getNumSum(b);
                if (numA == numB) {
                    return compare(a, b);
                }
                return numA - numB;
            }
            return Integer.compare(a.length(), b.length());
        });

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i)).append("\n");
        }

        System.out.println(sb);
    }

    static int getNumSum(String str) {
        int sum = 0;
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ('0' <= c && c <= '9') {
                sum += c - '0';
            }
        }
        return sum;
    }

    static int compare(String a, String b) {
        char[] aa = a.toCharArray();
        char[] bb = b.toCharArray();
        for (int i = 0; i < aa.length; i++) {
            if (aa[i] != bb[i]) return aa[i] - bb[i];
        }
        return -1;
    }
}
