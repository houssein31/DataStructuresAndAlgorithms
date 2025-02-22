package javaPrep.neetcode150.trees;

public class SameTree {

    public boolean isSameTree(TreeNode p, TreeNode q) {

        // If both nodes are null, the trees are the same at this point
        if (p == null && q == null) {
            return true;
        }

        // If one of the nodes is null, or if their values are different, the trees are not the same
        if (p == null || q == null || p.val != q.val) {
            return false;
        }

        // Recursively check the left and right subtrees
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
