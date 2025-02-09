package java.neetcode150.trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {

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
