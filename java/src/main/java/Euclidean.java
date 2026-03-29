public class Euclidean {
    public static void main(String[] args) {
        System.out.println(gcdRecursion(192, 270));
        System.out.println(gcdLoop(192, 270));
        System.out.println(lcm(192, 270));
    }

    static int gcdRecursion(int a, int b) {
        int r = a % b;
        if (r == 0) return b;
        return gcdRecursion(b, r);
    }

    static int gcdLoop(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    static int lcm(int a, int b) {
        return a * b / gcdRecursion(a, b);
    }
}
