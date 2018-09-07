public class 左旋转字符串 {


    //前面高低位换，后面高低位换，整体高低位换
    public static void main(String[] args) {
        左旋转字符串 root = new 左旋转字符串();
        String ss = root.LeftRotateString("abcdefgh", 5);
        System.out.println("11111111");
    }

    private String LeftRotateString(String abcdef, int i) {
        char[] arr = abcdef.toCharArray();
        if (arr.length < 0) {
            return "";
        }
        reserve(arr, 0, i - 1);
        reserve(arr, i, arr.length - 1);
        reserve(arr, 0, arr.length - 1);
        StringBuilder sb = new StringBuilder(arr.length);
        for (char cha : arr) {
            sb.append(cha);
        }
        return sb.toString();
    }

    private void reserve(char[] arr, int low, int high) {

        while (low < high) {
            char temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            high--;
            low++;
        }

    }


}
