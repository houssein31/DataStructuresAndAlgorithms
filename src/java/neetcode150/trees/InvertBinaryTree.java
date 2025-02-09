package java.neetcode150.trees;

public class InvertBinaryTree {

    public TreeNode invertTree(TreeNode root) {

        // Base case: if the tree is empty, return null
        if (root == null) {
            return null;
        }

        // Recursively invert the left and right subtrees
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        // Swap the left and right subtrees
        root.left = right;
        root.right = left;

        // Return the root after inverting the subtrees
        return root;
    }
}
