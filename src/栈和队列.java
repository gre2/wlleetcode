import java.util.Stack;

public class 栈和队列 {

    public static void main(String[] args) {


        //入队：将元素进栈A
        //出队：判断栈B是否为空，如果为空，则将栈A中所有元素pop，并push进栈B，栈B出栈；
        // 如果不为空，栈B直接出栈。


        //入栈：将元素进队列A
        //出栈：判断队列A中元素的个数是否为1，如果等于1，则出队列，否则将队列A中的元素   以此出队列并放入队列B，直到队列A中的元素留下一个，然后队列A出队列，再把   队列B中的元素出队列以此放入队列A中。
    }

    static Stack<Integer> stack1 = new Stack<Integer>();
    static Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}
