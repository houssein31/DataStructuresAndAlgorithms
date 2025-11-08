package javaPrep.neetcode150.trees;

public class SearchingInBinaryTree {

    // function to search a key in a BST
    static TreeNode search(TreeNode root, int key)
    {
        // Base Cases: root is null or key is present at
        // root
        if (root == null || root.val == key)
            return root;

        // Key is greater than root's key
        if (root.val < key)
            return search(root.right, key);

        // Key is smaller than root's key
        return search(root.left, key);
    }

    public static void main(String[] args)
    {

        // Creating a hard coded tree for keeping
        // the length of the code small. We need
        // to make sure that BST properties are
        // maintained if we try some other cases.
        TreeNode root = new TreeNode(50);
        root.left = new TreeNode(30);
        root.right = new TreeNode(70);
        root.left.left = new TreeNode(20);
        root.left.right = new TreeNode(40);
        root.right.left = new TreeNode(60);
        root.right.right = new TreeNode(80);

        // Searching for keys in the BST
        System.out.println(search(root, 19) != null
                ? "Found"
                : "Not Found");
        System.out.println(search(root, 80) != null
                ? "Found"
                : "Not Found");
    }
}
