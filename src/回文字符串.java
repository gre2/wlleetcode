public class 回文字符串 {

    public static void main(String[] args) {
        int i = isHuiWen1();
        System.out.println(i);
    }

    //daddabcba c

    private static int isHuiWen() {
        String s = "abcba";
        int i = 0;
        int j = s.length() - 1;
        char[] arr = s.toCharArray();
        while (i < arr.length && j > 0) {
            if (i == j) {
                return 1;
            }

            if ((int) arr[i] == (int) arr[j]) {
                i++;
                j--;
            } else {
                return -1;
            }
        }
        return 1;
    }
    private static int isHuiWen1() {
        String s = "abcdba";
        int i=0;
        int j=s.length()-1;
        char[] chars = s.toCharArray();
        while(i<=j){
            if(i==j){
                return 1;
            }
            if(chars[i]==chars[j]){
                i++;
                j--;
            }else{
                return -1;
            }
        }
        return 1;
    }
}
