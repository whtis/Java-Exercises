import javax.swing.*;

/**
 * Created by ht on 2015/12/15.
 */
public class $7_12 {
    public static void main(String[] args) {
//        String s1 = JOptionPane.showInputDialog("please enter the s1: ");
//        String s2 = JOptionPane.showInputDialog("please enter the s2: ");
        String s1 = "split";
        String s2 = "lispu";
        boolean b = isAnagram(s1, s2);
        System.out.println("s1、s2 is anagram? " + b);
    }

    //方法一，借助计数器直接判断
    private static boolean isAnagram(String s1, String s2) {
        if (s1.length() == s2.length()) {
            char[] c1 = s1.toCharArray();
            char[] c2 = s2.toCharArray();
            //使用count计数相同字符的个数，如果字符相同的个数和字符长度相等，则是变位词
            int count = 0;
            for (int i = 0; i < c1.length; i++) {
                for (int j = 0; j < c2.length; j++) {
                    if (c1[i] == c2[j]) {
                        count++;
                        break;
                    }
                }
            }
            if (count == c1.length) {
                return true;
            }
        }
        return false;
    }

    //方法二，先对传入的字符串进行排序，再使用equals方法进行比较
    //略
}
