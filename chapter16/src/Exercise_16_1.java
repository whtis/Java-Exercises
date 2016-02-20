import java.io.*;
import java.util.StringTokenizer;

/**
 * Created by ht on 2016/2/19.
 */
public class Exercise_16_1 {
    private static int charCount = 0;
    private static int wordCount = 0;
    private static int lineCount = 0;

    public static void main(String[] args) {
        File file = new File(args[0]);
        if (!file.exists()) {
            System.out.println("该文件不存在");
            System.exit(0);
        }
        FileReader fr = null;
        BufferedReader br = null;
        try {
            //统计字符数
            fr = new FileReader(file);
            while (fr.read() != -1) {
                charCount++;
            }
            //统计行数
            br = new BufferedReader(new FileReader(file));
            StringBuffer sb = new StringBuffer(charCount);
            String s;
            while ((s = br.readLine()) != null) {
                sb.append(s + "\n");
                lineCount++;
            }
            StringTokenizer st = new StringTokenizer(sb.toString(), " {};*");
            //统计单词数
            wordCount = st.countTokens();
            System.out.println(charCount + " Characters \n" + wordCount + " words,and \n" + lineCount + " lines");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
