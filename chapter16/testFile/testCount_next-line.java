import java.io.*;

/**
 * Created by ht on 2016/2/17.
 */
public class Copy 
{
    public static void main(String[] args) throws IOException 
    {
        if (args.length != 2) 
        {
            System.out.println("Usage: java CopyFile sourceFile targetFile");
            System.exit(0);
        }

        File sourceFile = new File("testFile/" + args[0]);
        if (!sourceFile.exists()) 
        {
            System.out.println("SourceFile " + args[0] + " is not existed");
            System.exit(0);
        }
        File targetFile = new File("testFile/" + args[1]);
        if (targetFile.exists()) 
        {
            System.out.println("Target file " + args[1] + " already exist");
            System.exit(0);
        }

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFile));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(targetFile));

        System.out.println("the file" + args[0] + " has " + bis.available() + " bytes");

        int r;
        while ((r = bis.read()) != -1) 
        {
            bos.write((byte) r);
        }

        bis.close();
        bos.flush();
        bos.close();
    }

}
