public class 字符串内最长回文 {

    public static void main(String[] args) {
        int i = get1("dddabcbac");
        System.out.println(i);
    }

    public static int get(String A) {
        char[] arrayA = A.toCharArray();
        int max = 0;
        int tempMax = 0;
        for (int i = 0; i < arrayA.length; i++) {  //i为回文串的中心位置
            //当回文串位数为奇数时
            for (int j = 0; (i - j) >= 0 && (i + j) < arrayA.length; j++) {
                if (arrayA[i - j] != arrayA[i + j])
                    break;
                tempMax = 2 * j + 1;
            }
            if (tempMax > max)
                max = tempMax;
            //当回文串位数为偶数时
            for (int j = 0; (i - j) >= 0 && (i + j + 1) < arrayA.length; j++) {
                if (arrayA[i - j] != arrayA[i + j + 1])
                    break;
                tempMax = 2 * j + 2;
            }
            if (tempMax > max)
                max = tempMax;
        }
        return max;
    }

    public static int get1(String s) {
        int n = s.length();
        boolean[][] pal = new boolean[n][n];
        //pal[i][j] 表示s[i...j]是否是回文串
        int maxLen = 0;
        for (int i = 0; i < n; i++) {  // i作为终点
            int j = i;    //j作为起点
            while (j >= 0) {
                if (s.charAt(j) == s.charAt(i)
                        && (i - j < 2 || pal[j + 1][i - 1])) {
                    pal[j][i] = true;
                    maxLen = Math.max(maxLen, i - j + 1);
                }
                j--;
            }
        }
        return maxLen;
    }
}
