    package baekjoon;
    /*
    자료구조: Set
    시간복잡도: O(N^3) [ O(N^2) ( N = S.length; N(N-1))/2 ) + substring 비용 ]
    공간복잡도: O(N^3)
     */

    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.util.HashSet;

    public class B11478_CountOfSubsets {
        public static void main(String[] args) throws IOException {
            var br = new BufferedReader(new InputStreamReader(System.in));
            String S = br.readLine();

            var set = new HashSet<String>();

            for (int i = 0; i < S.length(); i++) {
                for (int j = i + 1; j <= S.length(); j++) {
                    set.add(S.substring(i, j));
                }
            }

            System.out.println(set.size());
        }
    }
