package recursion;

public class Fibo {
    public static int getNthFiboNum(int n) {
        return fibo(0, 1, n);
    }

    private static int fibo(int a, int b, int n) {
        if (n == 0) return a;
        if (n == 1) return b;
        return fibo(b, a + b, n - 1);
    }
}
