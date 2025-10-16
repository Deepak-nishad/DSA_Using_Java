package DeleteBSt;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

class Solution {

    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode temp = root;

        while (temp != null) {
            if (temp.val == val) {
                return temp;
            } else if (val < temp.val) {
                temp = temp.left;
            } else if (val > temp.val) {
                temp = temp.right;
            }
        }

        return null;
    }

    public TreeNode deleteNode(TreeNode root, int key) {
        TreeNode resNode = searchBST(root, key);
        TreeNode temp = root;
        TreeNode tag = root;

        if (resNode == null) {
            System.out.println("Node with value " + key + " not found!");
            return root;
        } else {

            while (temp != null) {
                // case 1: leaf node
                if (temp.left == null && temp.right == null) {
                    if (tag.left == temp) {
                        tag.left = null;
                    } else {
                        tag.right = null;
                    }
                    break;
                }

                // case 2: only left child
                if (temp.left != null && temp.right == null) {
                    if (tag.left == temp) {
                        tag.left = temp.left;
                    } else {
                        tag.right = temp.left;
                    }
                    break;
                }

                // case 3: only right child
                if (temp.left == null && temp.right != null) {
                    if (tag.left == temp) {
                        tag.left = temp.right;
                    } else {
                        tag.right = temp.right;
                    }
                    break;
                }

                // case 4: two children
                else if (temp.left != null && temp.right != null) {
                    if (tag.left == temp) {
                        tag.left = temp.right;
                        tag = tag.left;
                    } else if (tag.right == temp) {
                        tag.right = temp.right;
                        tag = tag.right;
                    }

                    while (tag.left != null) {
                        tag = tag.left;
                    }

                    tag.left = temp.left;
                    break;
                }

                temp.left = null;
                temp.right = null;
            }
        }

        return root;
    }

    // helper: inorder traversal
    public void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }
}

public class Main {
    public static void main(String[] args) {
        // create sample BST
        TreeNode root = new TreeNode(50);
        root.left = new TreeNode(30);
        root.right = new TreeNode(70);
        root.left.left = new TreeNode(20);
        root.left.right = new TreeNode(40);
        root.right.left = new TreeNode(60);
        root.right.right = new TreeNode(80);

        Solution sol = new Solution();

        System.out.println("Original BST (Inorder Traversal):");
        sol.inorder(root);
        System.out.println();

        int keyToDelete = 70;
        System.out.println("\nDeleting node with value " + keyToDelete + "...");
        root = sol.deleteNode(root, keyToDelete);

        System.out.println("\nBST after deletion (Inorder Traversal):");
        sol.inorder(root);
        System.out.println();
    }
}
