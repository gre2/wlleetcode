public class 二叉树镜像 {

    TreeNode root;

    public 二叉树镜像(int[] arr) {
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
        二叉树镜像 tree = new 二叉树镜像(arr);
        tree.reverseTree();
    }

    private void reverseTree() {
        reverseTreeNode(root);
    }

    private void reverseTreeNode(TreeNode root) {
        if (root == null) {
            return;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        reverseTreeNode(root.left);
        reverseTreeNode(root.right);
    }
}
