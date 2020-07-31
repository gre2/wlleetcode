public class 回文数字 {

    public static void main(String[] args) {
        System.out.println(isHuiWen(1244231L));
    }

    private static boolean isHuiWen1(Long num) {
        Long temp = num;
        Long reserve = 0L;
        while (temp != 0) {
            reserve = reserve * 10 + temp % 10;
            temp = temp / 10;
        }
        return num == temp;
    }

    private static  Long isHuiWen(Long num) {
       Long x=0L;
       while(num!=0){
           x=x*10+num%10;
           num=num/10;
       }
       return x;
    }
}
