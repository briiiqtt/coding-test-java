public class BaseConverter {
    public static void main(String[] args) {
        long snowflakeExample = 1888944671579078978L;
//        String bits = "1 11111111 11111111 11111111 11111111 11111111";
        String bits = "00000000 00000001";
        bits = bits.replaceAll(" ", "");

        long b = binToDec(bits);

        String c = decToBase62(b);

        System.out.println(c);
    }

    static long binToDec(String binary) {
        long dec = 0;
        char[] chars = binary.toCharArray();
        long q = 1;
        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] == '1') {
                dec += q;
            }
            q *= 2;
        }
        return dec;
    }

    static String decToBase62(long decimal) {
        String base62 = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder sb = new StringBuilder();
        while (decimal > 0) {
            sb.append(base62.charAt((int) (decimal % 62)));
            decimal /= 62;
        }
        return sb.reverse().toString();
    }
}
