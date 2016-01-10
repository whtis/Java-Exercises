import javax.swing.*;

/**
 * Created by ht on 2015/11/29.
 */
public class CountLettersInArray {
    public static void main(String[] args) {
        int numberOfLetters = Integer.parseInt(JOptionPane.showInputDialog("please enter the number of letters: "));
        char[] letters = new char[numberOfLetters];

        int[] counts = new int[26];

        for (int i = 0; i < numberOfLetters; i++) {
            letters[i] = (char) ('a' + Math.random() * ('z' - 'a' + 1));
        }
        for (char letter : letters) {
            counts[letter - 'a']++;
        }

        for (int i = 0; i < counts.length; i++) {
            char cha = (char) (i + 'a');
            System.out.println(cha + " appear times is " + counts[i]);
        }
    }
}
