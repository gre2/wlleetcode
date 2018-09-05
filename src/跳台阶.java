public class 跳台阶 {

    public static void main(String[] args) {
        int n = 3;//台阶数
        int oneToTwo = OneAndTwo(n);
        int oneToN = OneToN(n);
        System.out.println("11111111111111");
    }


    private static int OneAndTwo(int n) {
        if (n <= 0) {
            return -1;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return OneToN(n - 1) + OneToN(n - 2);
    }

    private static int OneToN(int n) {
        if (n <= 0) {
            return -1;
        }
        if (n == 1) {
            return 1;
        }
        return 2 * OneToN(n - 1);
    }


}
