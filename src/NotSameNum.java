import java.util.Stack;

public class NotSameNum {
    public static void main(String[] args) {
        //2,3,5,5,5,3,4,6,6,5,4
        //2,3,3,4,5,4
        //2,4,5,4
        int arr[]=new int[]{2,3,5,5,5,3,4,6,6,5,4};
        String abbacad = removeDuplicates("abbacad");
        System.out.println(abbacad);
    }

    public static String removeDuplicates(String S) {
        StringBuilder res = new StringBuilder();
        int size = 0;
        for (int i = 0; i < S.length(); i++) {
            if(size != 0 && res.charAt(size-1) == S.charAt(i))
                res.deleteCharAt(--size);
            else{
                res.append(S.charAt(i));
                size++;
            }
        }
        return res.toString();
    }

    public static String removeDuplicates1(String S) {
        /* 只需删除重复项即可，因此可以使用栈实现
         * 每次添加时比较是否与栈顶元素相同
         *   - 若相同则删除栈顶元素且不插入
         *   - 若不相同则插入新元素
         * 时间复杂度：O(N)
         * 空间复杂度：O(N)
         */
        char[] s = S.toCharArray();
        int len = s.length;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < len; i++) {
            if (stack.isEmpty() || s[i] != stack.peek()) {
                stack.push(s[i]);
            } else {
                stack.pop();
            }
        }
        /* 数据的展示可以继续优化 */
        StringBuilder str = new StringBuilder();
        for (Character c : stack) {
            str.append(c);
        }
        return str.toString();

    }

}
