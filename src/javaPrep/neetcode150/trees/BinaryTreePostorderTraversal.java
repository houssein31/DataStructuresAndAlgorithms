package javaPrep.neetcode150.trees;

import java.util.*;

public class BinaryTreePostorderTraversal {

    //Recursive Solution
    public static List<Integer> postorder(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        traverse(root, result);
        return result;
    }

    private static void traverse(TreeNode node, List<Integer> result) {
        if (node == null) return;

        traverse(node.left, result);   // 1. traverse left
        traverse(node.right, result);  // 2. traverse right
        result.add(node.val);          // 3. visit root
    }

    //Iterative Solution
    public static List<Integer> postorderIterative(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        // Simulate root → right → left (reverse of postorder)
        while (!stack.isEmpty()) {
            TreeNode curr = stack.pop();
            result.add(curr.val);  // Add in normal order

            if (curr.left != null) stack.push(curr.left);
            if (curr.right != null) stack.push(curr.right);
        }

        // Reverse to get left → right → root (postorder)
        Collections.reverse(result);
        return result;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println(postorder(root));  // Output: [4, 5, 2, 3, 1]
    }
}
