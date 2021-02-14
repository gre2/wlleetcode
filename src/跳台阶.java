import java.util.Scanner;

public class 跳台阶 {

    //https://blog.csdn.net/zkd758/article/details/85143580
    public static int jumpFloor(int target) {
        if (target == 1) {
            return 1;
        } else if (target == 2) {
            return 2;
        } else {
            int sum=jumpFloor(target-1)+jumpFloor(target-2);
            return sum;
        }
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int target= scan.nextInt();
        System.out.println(jumpFloor(target));
    }


}
