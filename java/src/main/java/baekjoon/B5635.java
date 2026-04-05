package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.StringTokenizer;

public class B5635 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        String nameMax = "";
        LocalDate dateMax = null;
        String nameMin = "";
        LocalDate dateMin = null;

        for (int i = 1; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int dd = Integer.parseInt(st.nextToken());
            int mm = Integer.parseInt(st.nextToken());
            int yyyy = Integer.parseInt(st.nextToken());
            LocalDate date = LocalDate.of(yyyy, mm, dd);

            if (dateMin == null || date.isBefore(dateMin)) {
                dateMin = date;
                nameMin = name;
            }
            if (dateMax == null || date.isAfter(dateMax)) {
                dateMax = date;
                nameMax = name;
            }
        }

        System.out.println(nameMax + "\n" + nameMin);
    }
}
