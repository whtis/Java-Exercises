package _17_6;


/**
 * Created by ht on 2016/3/22.
 */
public class MoreFieldBinaryTree {

    private TreeNode root;

    private int size = 0;


    public MoreFieldBinaryTree() {
    }

    public MoreFieldBinaryTree(Object[] objects) {
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
        size++;
        return true;
    }

    public boolean search(Object o) {
        TreeNode parent = null;
        TreeNode current = root;
        while (current != null) {
            if (((Comparable) o).compareTo(current.element) < 0) {
                parent = current;
                current = current.left;
            } else if (((Comparable) o).compareTo(current.element) > 0) {
                parent = current;
                current = current.right;
            } else if (((Comparable) o).compareTo(current.element) == 0) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        return size;
    }

    public int depth() {
        return treeDepth(root);
    }

    public static int treeDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = treeDepth(root.left);
        int right = treeDepth(root.right);
        return left > right ? (left + 1) : (right + 1);
    }

    public void inorder() {
        inorder(root);
    }

    /**
     * inorder traversal from a subtree
     *
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
        if (root == null) return;
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
