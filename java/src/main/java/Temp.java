public class Temp {
    public static void main(String[] args) {
        long val = factorial(10);
        System.out.println(val);
    }
    static long factorial(long val){
        if (val == 0) return 1;
        return val * factorial(val - 1);
    }
}
