package BinaryTree;

/**
 * Created by ht on 2016/3/19.
 */
public class BinaryTree {
    private TreeNode root;

    public BinaryTree() {
    }

    public BinaryTree(Object[] objects) {
        for (int i = 0; i < objects.length; i++) {
            insert(objects[i]);
        }
    }

    public boolean insert(Object o) {
        if (root == null) {
            root = new TreeNode(o);
        } else {
            TreeNode parent = null;
            TreeNode current = root;
            while (current != null) {
                if (((Comparable) o).compareTo(current.element) < 0) {
                    parent = current;
                    current = current.left;
                } else if (((Comparable) o).compareTo(current.element) > 0) {
                    parent = current;
                    current = current.right;
                } else {
                    return false;
                }
            }
            if (((Comparable) o).compareTo(parent.element) < 0) {
                parent.left = new TreeNode(o);
            } else {
                parent.right = new TreeNode(o);
            }
        }
        return true;
    }

    public void inorder() {
        inorder(root);
    }

    /**
     * inorder traversal from a subtree
     * @param root
     */
    private void inorder(TreeNode root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.element + " ");
        inorder(root.right);
    }

    public void postorder() {
        postorder(root);
    }

    private void postorder(TreeNode root) {
        if (root==null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.element + " ");
     }

    public void preorder() {
        preorder(root);
    }

    private void preorder(TreeNode root) {
        if (root == null) return;
        System.out.print(root.element + " ");
        preorder(root.left);
        preorder(root.right);
    }
}
