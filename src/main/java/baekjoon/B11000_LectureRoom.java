package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B11000_LectureRoom {

    static class Lecture {
        int start;
        int end;

        Lecture(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        ArrayList<Lecture> lectures = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            lectures.add(new Lecture(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }

        lectures.sort((a, b) -> {
            return Integer.compare(a.start, b.start);
        });

        PriorityQueue<Integer> lecturesInProgress = new PriorityQueue<>();
        for (Lecture l: lectures) {
            if (!lecturesInProgress.isEmpty() && lecturesInProgress.peek() <= l.start) {
                lecturesInProgress.poll();
            }
            lecturesInProgress.offer(l.end);
        }

        System.out.println(lecturesInProgress.size());
    }
}
