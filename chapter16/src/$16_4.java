import java.io.*;

/**
 * Created by ht on 2016/2/19.
 */
public class $16_4 {
    public static void main(String[] args) throws IOException {
        File targetFile = new File("testFile/testCount_next-line.java");
        File sourceFile = new File("testFile/testCount_end-of-line.java");
//        convertNextLine(sourceFile, targetFile);
//        convertEndOfLine(sourceFile, targetFile);
        convertNextLineTwo(sourceFile,targetFile);

    }

    static void convertNextLine(File sourceFile, File targetFile) throws IOException {

        FileReader fr = new FileReader(sourceFile);
        FileWriter fw = new FileWriter(targetFile);
        int i;
        boolean b = false;
        int countSpace = 0;
        while ((i = fr.read()) != -1) {
            char c = (char) i;
            if (b) {
                if (c == '\r' || c == '\n' || c == ' ') {
                    countSpace++;
                } else {
                    for (int j = 0; j < countSpace - 6; j++) {
                        fw.write(' ');
                    }
                    fw.write('{');
                    fw.write('\n');
                    for (i = 0; i < countSpace - 2; i++) {
                        fw.write(' ');
                    }
                    fw.write(c);
                    b = false;
                    countSpace = 0;
                }
            } else if (c == '{') {
                fw.write("\n");
                b = true;
            } else {
                fw.write(c);
            }
        }
        fr.close();
        fw.flush();
        fw.close();
    }

    static void convertNextLineTwo(File sourceFile, File targetFile) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(sourceFile));
        BufferedWriter bw = new BufferedWriter(new FileWriter(targetFile));
        String s;
        while ((s = br.readLine()) != null) {
            if (s.trim().endsWith("{")) {
                bw.write(s.substring(0, s.length() - 1));
                bw.newLine();
                char[] chars = s.toCharArray();
                for (int i = 0; i < chars.length; i++) {
                    if (chars[i] != ' ') {
                        break;
                    } else {
                        bw.write(' ');
                    }
                }
                bw.write("{");
            } else {
                bw.write(s);
                bw.newLine();
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
    private static void convertEndOfLine(File sourceFile, File targetFile) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(sourceFile));
        BufferedWriter bw = new BufferedWriter(new FileWriter(targetFile));

        boolean b = false;
        String str;
        while ((str = br.readLine()) != null) {
            if (!b) {
                bw.write(str);
                bw.flush();
                b = true;
            } else {

                if (str.trim().equals("{")) {
                    bw.write("{" + "\n");
                } else {
                    bw.newLine();
                    bw.write(str);
                }
            }

        }
        br.close();
        bw.flush();
        bw.close();
    }
}

