/**
 * Created by ht on 2015/11/22.
 */
public class TestRandomCharacter {
    public static void main(String[] args) {
        final int NUMBE_OF_CHARS = 175;
        final int CHAES_PER_LINE = 25;
        for (int i = 0; i < NUMBE_OF_CHARS; i++) {
            char ch = RandomCharacter.getRandomLowerCaseLetter();
            if ((i + 1) % CHAES_PER_LINE == 0) {
                System.out.println(ch);
            } else System.out.print(ch + " ");
        }
    }
}
