package javaSubject.neetcode150.trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePreorderTraversal {

    public List<Integer> preorderTraversal(TreeNode root) {
        // Stack for nodes to visit and list for results.
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> answer = new ArrayList<>();

        // Return empty list if the tree is empty.
        if (root == null) return answer;

        // Start with the root node.
        stack.push(root);

        // Process nodes until the stack is empty.
        while (!stack.isEmpty()) {
            TreeNode temp = stack.pop();  // Remove the top node.
            answer.add(temp.val);         // Visit the node.

            // Push right child first so left child is processed next.
            if (temp.right != null) stack.push(temp.right);
            if (temp.left != null) stack.push(temp.left);
        }

        return answer;
    }
}
