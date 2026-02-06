package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class B32386_KCPC {
    public static void main(String[] args) throws IOException {
        /*
        s=문제번호
        t=태그개수
        an=태그문자열

        입력:
        N
        s t a1 a2 ... at

        출력:
        가장 자주 등장한 태그
        (여러개면 -1)
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            st.nextToken();
            int t = Integer.parseInt(st.nextToken());

            for (int j = 0; j < t; j++) {
                String tag = st.nextToken();
                int val = map.getOrDefault(tag, 0);
                map.put(tag, val + 1);
            }
        }

        boolean moreThanOne = false;
        int max = 0;
        String maxTag = "";
        for (Map.Entry<String, Integer> a : map.entrySet()) {
            int count = a.getValue();
            if (max < count) {
                max = count;
                moreThanOne = false;
                maxTag = a.getKey();
            } else if (max == count) {
                moreThanOne = true;
            }
        }

        System.out.println(moreThanOne ? -1 : maxTag);
    }
}
