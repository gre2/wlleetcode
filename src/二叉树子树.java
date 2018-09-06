public class 二叉树子树 {


    public static void main(String[] args) {
        TreeNode childRoot = null;
        TreeNode parentRoot = null;
        二叉树子树 tree = new 二叉树子树();
        tree.hasChildTree(childRoot, parentRoot);
    }

    public boolean hasChildTree(TreeNode parentRoot, TreeNode childRoot) {
        boolean flag = false;
        if (childRoot != null && parentRoot != null) {
            if (childRoot.value == parentRoot.value) {
                flag = isSameTree(childRoot, parentRoot);
            }
            if (!flag) {
                hasChildTree(parentRoot.left, childRoot);
            }
            if (!flag) {
                hasChildTree(parentRoot.right, childRoot);
            }
        }
        return flag;
    }

    private boolean isSameTree(TreeNode parentRoot, TreeNode childRoot) {
        //子树遍历完了
        if (childRoot == null) {
            return true;
        }
        //子树没有便利完，父树遍历完了
        if (parentRoot == null) {
            return true;
        }
        if (parentRoot.value != childRoot.value) {
            return false;
        }
        return isSameTree(parentRoot.left, childRoot.left) && isSameTree(parentRoot.right, childRoot.right);
    }


}
