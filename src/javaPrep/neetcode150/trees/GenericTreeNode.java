package javaPrep.neetcode150.trees;

import java.util.*;

public class GenericTreeNode {
    int val;
    List<GenericTreeNode> children;

    public GenericTreeNode(int val) {
        this.val = val;
        this.children = new ArrayList<>();
    }

    public void addChild(GenericTreeNode child) {
        children.add(child);
    }

    public void removeChild(GenericTreeNode child) {
        children.remove(child);
    }

    public int findDepthOfTree() {
        if (children.isEmpty()) {
            return 1;
        }

        int maxChildDepth = 0;
        for (GenericTreeNode child : children) {
            maxChildDepth = Math.max(maxChildDepth, child.findDepthOfTree());
        }
        return 1 + maxChildDepth;
    }

    public List<List<Integer>> levelOrderTraversal() {
        List<List<Integer>> result = new ArrayList<>();
        Queue<GenericTreeNode> queue = new LinkedList<>();
        queue.offer(this); // Start from the current node (assumed root)

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                GenericTreeNode current = queue.poll();
                currentLevel.add(current.val);

                for (GenericTreeNode child : current.children) {
                    queue.offer(child);
                }
            }

            result.add(currentLevel);
        }

        return result;
    }

    public List<List<Integer>> levelOrderZigzagTraversal() {
        List<List<Integer>> result = new ArrayList<>();
        if (this == null) return result;

        Queue<GenericTreeNode> queue = new LinkedList<>();
        queue.offer(this);
        boolean leftToRight = true;

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            LinkedList<Integer> currentLevel = new LinkedList<>();

            for (int i = 0; i < levelSize; i++) {
                GenericTreeNode current = queue.poll();

                if (leftToRight) {
                    currentLevel.addLast(current.val);
                } else {
                    currentLevel.addFirst(current.val);
                }

                for (GenericTreeNode child : current.children) {
                    queue.offer(child);
                }
            }

            result.add(currentLevel);
            leftToRight = !leftToRight;
        }

        return result;
    }
}