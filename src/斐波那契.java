public class 斐波那契 {

    public static void main(String[] args) {
        int sum = Fibonacci(5);
        System.out.println(sum);
    }

    //补0，算到n+1,然后倒推
    public static int Fibonacci(int n) {
        int f = 0, g = 1;
        while (n-- > 0) {
            g = g + f;
            f = g - f;
        }
        return f;
    }
}
