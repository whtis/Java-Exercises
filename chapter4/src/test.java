import com.sun.corba.se.impl.io.IIOPOutputStream;

import javax.swing.*;
import java.io.*;
import java.util.Scanner;

/**
 * Created by ht on 2015/11/25.
 */
public class test {
    public static void main(String[] args) throws IOException {
        String string = "我在中国哪个hahha";
        FileOutputStream fos = new FileOutputStream("my.txt"); // 创建输出类
        fos.write(string.getBytes());                    // 写入数据，只能是byte
        fos.close();                                          // 关闭文件
        FileWriter fw = new FileWriter("my.txt"); // 创建输出类
        fw.write(string);                   // 写入数据，可以直接写字符串
        fw.close();                             // 关闭文件
        }

    }
