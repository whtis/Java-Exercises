import java.io.*;
import java.util.*;

/**
 * Created by ht on 2016/3/31.
 */
public class Exercise18_3 {

    public static void main(String[] args) throws IOException {
        String[] javaKeyWords = {"private", "protected", "public", "abstract", "class", "extends", "final", "implements",
                "interface", "native", "new", "static", "strictfp", "synchronized", "transient", "volatile", "break", "continue",
                "return", "do", "while", "if", "else", "for", "instanceof", "switch", "case", "default", "try", "catch", "throw",
                "throws", "import", "package", "boolean", "byte", "char", "double", "float", "int", "long", "short", "null", "true",
                "false", "super", "this", "void", "goto", "const"
        };

        Set set = new HashSet<>();
        for (int i = 0; i < javaKeyWords.length; i++) {
            set.add(javaKeyWords[i]);
        }

        int count = 0;
//        File file = new File(args[0]);
        File file = new File("src/Exercise18_2.java");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String s;
        StringBuilder info = new StringBuilder();
        while ((s = br.readLine()) != null) {
            info.append(s).append("\n");
        }
        br.close();

        StringTokenizer st = new StringTokenizer(info.toString(), ";{} []");
        while (st.hasMoreTokens()) {
            if (set.contains(st.nextToken())) {
                count++;
            }
        }

        System.out.println("the key words is " + count);
    }
}
