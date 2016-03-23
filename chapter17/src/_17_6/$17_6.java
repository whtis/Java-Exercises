package _17_6;

/**
 * Created by ht on 2016/3/22.
 */
public class $17_6 {
    public static void main(String[] args) {
        MoreFieldBinaryTree tree = new MoreFieldBinaryTree();
        tree.insert("George");
        tree.insert("Michael");
        tree.insert("Tom");
        tree.insert("Adam");
        tree.insert("Jones");
        tree.insert("Peter");
        tree.insert("Daniel");

        System.out.println(tree.search("Tom"));
        System.out.println(tree.size());

        System.out.println(tree.depth());
    }
}
