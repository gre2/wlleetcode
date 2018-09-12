public class 回文数字 {

    public static void main(String[] args) {
        boolean flag = isHuiWen(124421L);
    }

    private static boolean isHuiWen(Long num) {
        Long temp = num;
        Long reserve = 0L;
        while (temp != 0) {
            reserve = reserve * 10 + temp % 10;
            temp = temp / 10;
        }
        return num == temp;
    }
}
