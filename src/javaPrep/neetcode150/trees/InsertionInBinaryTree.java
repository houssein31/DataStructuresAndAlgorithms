package javaPrep.neetcode150.trees;

class InsertionInBinaryTree {

    // A utility function to insert a new node
    // with the given key
    static TreeNode insert(TreeNode root, int key)
    {

        // If the tree is empty, return a new node
        if (root == null)
            return new TreeNode(key);

        // If the key is already present in the tree,
        // return the node
        if (root.val == key)
            return root;

        // Otherwise, recur down the tree
        if (key < root.val)
            root.left = insert(root.left, key);
        else
            root.right = insert(root.right, key);

        // Return the (unchanged) node pointer
        return root;
    }

    // A utility function to do inorder tree traversal
    static void inorder(TreeNode root)
    {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.val + " ");
            inorder(root.right);
        }
    }

    // Driver method
    public static void main(String[] args)
    {
        TreeNode root = null;

        // Creating the following BST
        //      50
        //     /  \
        //    30   70
        //   / \   / \
        //  20 40 60 80

        root = insert(root, 50);
        root = insert(root, 30);
        root = insert(root, 20);
        root = insert(root, 40);
        root = insert(root, 70);
        root = insert(root, 60);
        root = insert(root, 80);

        // Print inorder traversal of the BST
        inorder(root);
    }
}