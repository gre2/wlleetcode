import java.util.ArrayDeque;
import java.util.Stack;

public class 二叉树遍历 {
    TreeNode root;

    public 二叉树遍历(int[] arr) {
        root = makeTreeByArray(arr, 1);
    }

    /**
     * 构建
     ***/
    public static TreeNode makeTreeByArray(int[] array, int index) {
        if (index < array.length) {
            int value = array[index];
            if (value != 0) {
                TreeNode t = new TreeNode(value);
                array[index] = 0;
                t.left = makeTreeByArray(array, index * 2);
                t.right = makeTreeByArray(array, index * 2 + 1);
                return t;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] arr = {0, 13, 65, 5, 97, 25, 0, 37, 22, 0, 4, 28, 0, 0, 32, 0};
        二叉树遍历 tree = new 二叉树遍历(arr);
        tree.gd();
        System.out.println("----------------------");
        tree.sd();
        System.out.println("----------------------");
        tree.sddg();
    }


    /**
     * 遍历
     ***/
    //广度就是层级遍历
    private void gd() {
        if (root == null) {
            return;
        }
        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        while (queue.isEmpty() == false) {
            TreeNode tree = queue.remove();
            System.out.print(tree.value + "    ");
            if (tree.left != null) {
                queue.offer(tree.left);
            }
            if (tree.right != null) {
                queue.offer(tree.right);
            }
        }
    }

    //深度就是前序
    private void sd() {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (stack.empty() == false) {
            TreeNode tree = stack.pop();
            System.out.print(tree.value + "    ");
            if (tree.right != null) {
                stack.push(tree.right);
            }
            if (tree.left != null) {
                stack.push(tree.left);
            }
        }
    }


    //深度就是前序，不用递归是以为之前每次调用的中间变量都需要保存，容易虚拟机栈溢出
    private void sddg() {
        sddgRoot(root);
        System.out.println("----------------------");
        zx(root);
        System.out.println("----------------------");
        hx(root);
    }


    private void sddgRoot(TreeNode root) {
        if (root != null) {
            System.out.print(root.value + "    ");
            sddgRoot(root.left);
            sddgRoot(root.right);
        }
    }

    private void zx(TreeNode root) {
        if (root != null) {
            zx(root.left);
            System.out.print(root.value + "    ");
            zx(root.right);
        }
    }

    private void hx(TreeNode root) {
        if (root != null) {
            hx(root.left);
            hx(root.right);
            System.out.print(root.value + "    ");
        }
    }


}
