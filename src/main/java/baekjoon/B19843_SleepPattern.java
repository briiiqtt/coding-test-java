package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B19843_SleepPattern {

    public static int getAbsoluteTime(String day, int time) {
        switch (day) {
            case "Mon":
                return time;
            case "Tue":
                return 24 + time;
            case "Wed":
                return 48 + time;
            case "Thu":
                return 72 + time;
            default:
                return 96 + time;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());

        int totalSlept = 0;
        for (int i = 0; i < T; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            String day1 = st2.nextToken();
            int time1 = Integer.parseInt(st2.nextToken());
            String day2 = st2.nextToken();
            int time2 = Integer.parseInt(st2.nextToken());

            totalSlept += getAbsoluteTime(day2, time2) - getAbsoluteTime(day1, time1);
        }

        if (totalSlept + 48 < N) {
            System.out.println(-1);
        } else if (totalSlept > N) {
            System.out.println(0);
        } else {
            System.out.println(N - totalSlept);
        }
    }
}
