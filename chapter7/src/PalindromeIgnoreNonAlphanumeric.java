import javax.swing.*;

/**
 * Created by ht on 2015/12/13.
 */
public class PalindromeIgnoreNonAlphanumeric {
    public static void main(String[] args) {
//        String str = JOptionPane.showInputDialog("please enter a string: ");
        String str = "ahkgsd><dsgkha";
        StringBuffer s = filter(str);
        boolean b = checkPalindrome(s);
        String output = "Ignoring non-alphanumeric characters,\nis " + str + " a palindrome?" + b;
        JOptionPane.showMessageDialog(null, output);
    }

    private static StringBuffer filter(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetterOrDigit(str.charAt(i))) {
                stringBuffer.append(str.charAt(i));
            }
        }
        return stringBuffer;
    }

    private static boolean checkPalindrome(StringBuffer s) {
        //传入StringBuffer对象不是很好，容易导致逆序的时候原来s也变为逆序，这样会返回值一直是true
        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        //不能直接比较Stringbuffer，Stringbuffer没有重写equals方法，比较的是地址
        return sb.toString().equals(s.toString());
    }
}
