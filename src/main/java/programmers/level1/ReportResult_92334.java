package programmers.level1;

import java.util.*;

public class ReportResult_92334 {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        HashMap<String, HashSet<String>> map = new HashMap<>();

        for (int i = 0; i < report.length; i++) {
            var tokens = report[i].split(" ");
            String reporter = tokens[0];
            String target = tokens[1];

            HashSet<String> reporterSet = map.getOrDefault(target, null);
            if (reporterSet == null) {
                reporterSet = new HashSet<String>();
                map.put(target, reporterSet);
            }

            reporterSet.add(reporter);
        }

        for (int i = 0; i < id_list.length; i++) {
            answer[i] = 0;
            for (var e : map.entrySet()) {
                var reporterSet = e.getValue();
                if (reporterSet.size() >= k && reporterSet.contains(id_list[i])) {
                    answer[i] += 1;
                }
            }
        }

        return answer;
    }
}
