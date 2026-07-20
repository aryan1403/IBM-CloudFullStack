package java03;

public class test {
    int a;
    int b;
    test(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "test [a=" + a + ", b=" + b + "]";
    }

    public static void main(String[] args) {
        System.out.println(args[0]);
        test t = new test(1, 2);
        int x = 1 > 2 ? 1 : 2;
        System.out.println(t);
        System.out.println(x);
    }
}
