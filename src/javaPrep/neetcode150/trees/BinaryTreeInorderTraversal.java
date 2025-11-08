package javaPrep.neetcode150.trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {

    // Recursive Solution
    public static List<Integer> inorder(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        traverse(root, result);
        return result;
    }
    private static void traverse(TreeNode node, List<Integer> result) {
        if (node == null) return;

        traverse(node.left, result);      // 1. traverse left
        result.add(node.val);             // 2. traverse root
        traverse(node.right, result);     // 3. visit rightif
    }



    // Iterative Solution
    public List<Integer> inorderTraversal(TreeNode root) {

        Stack<TreeNode> stack = new Stack<>();
        List<Integer> answer = new ArrayList<>();

        if(root == null)
            return answer;

        TreeNode current = root;

        while(current != null || !stack.isEmpty()) {
            while(current != null ) {
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();
            answer.add(current.val);
            current =  current.right;
        }

        return answer;
    }
}
