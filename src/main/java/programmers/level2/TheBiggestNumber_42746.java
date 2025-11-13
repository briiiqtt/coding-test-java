package programmers.level2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class TheBiggestNumber_42746 {
    public String solution(int[] numbers) {

        String[] strs = Arrays.stream(numbers)
                .mapToObj(String::valueOf)
                .toArray(String[]::new);

    }
}
