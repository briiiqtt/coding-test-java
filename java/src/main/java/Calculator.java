public class Calculator {
    static int add(int a, int b) {
        int result = 0;
        int carry = 0;
        for (int i = 0; i < 32; i++) {
            int bitA = (a >> i) & 1;
            int bitB = (b >> i) & 1;

            int currentSum = bitA ^ bitB ^ carry;

            carry = (bitA & bitB) | carry & (bitA ^ bitB);

            result |= currentSum << i;
        }
        return result;
    }

    static int cpuAdd(int a, int b) {
        while (b != 0) {
            // 올림수구하기: 더했을 때 올림이 발생하는 자리의 비트만 1로 남겨둠
            int carry = a & b;

            // 합 구하기: 올림수 고려없이 각 자리의 비트를 결정
            a = a ^ b;

            // 올림수가 발생한 비트들의 자릿수를 하나씩 올리고 다음 반복에서 다시 연산
            b = carry << 1;
        }
        // 올림수가 더이상 발생하지 않을 때 루프 탈출
        return a;
    }

    public static void main(String[] args) {
        int a = cpuAdd(1111, 200909);
        System.out.println(a);
    }
}
