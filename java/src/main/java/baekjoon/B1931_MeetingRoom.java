package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B1931_MeetingRoom {

    static class Meeting {
        int startTime;
        int endTime;

        Meeting(int startTime, int endTime) {
            this.startTime = startTime;
            this.endTime = endTime;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<Meeting> meetings = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            meetings.add(new Meeting(start, end));
        }

        meetings.sort((a, b) -> {
            if (a.endTime != b.endTime) return Integer.compare(a.endTime, b.endTime);
            else return Integer.compare(a.startTime, b.startTime);
        });

        Meeting cur = meetings.get(0);
        int count = 1;
        for (int i = 1; i < meetings.size(); i++) {
            Meeting next = meetings.get(i);
            if (next.startTime >= cur.endTime) {
                count++;
                cur = next;
            }
        }

        System.out.println(count);
    }
}
