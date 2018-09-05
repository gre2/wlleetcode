public class 数组找数 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {2, 3, 4}, {3, 4, 5}, {4, 5, 6}};
        int target = 5;
        boolean flag = getNum(arr, 5);
    }

    //每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序
    //方法：左下角开始找
    private static boolean getNum(int[][] arr, int target) {
        int row = arr.length;
        int col = arr[0].length;
        int i, j = 0;
        for (i = row - 1, j = 0; i >= 0 && j < col; ) {
            if (arr[i][j] == target) {
                return true;
            }
            if (arr[i][j] > target) {
                i--;
            }
            if (arr[i][j] < target) {
                j++;
            }
        }
        return false;
    }

}
