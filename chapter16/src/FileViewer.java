import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

/**
 * Created by ht on 2016/2/17.
 */
public class FileViewer extends JFrame implements ActionListener {

    private JButton btView;

    private JLabel jLabel;

    private JTextField jtf;

    private JTextArea textArea;

    //同一文件不能读两次，用filename限制
    private String filename = "";

    public FileViewer() throws HeadlessException {
        jLabel = new JLabel("Filename");

        jtf = new JTextField(20);
        jtf.addActionListener(this);

        btView = new JButton("View");
        btView.addActionListener(this);

        textArea = new JTextArea(10, 20);
        textArea.setEditable(false);
        JScrollPane jsp = new JScrollPane(textArea);

        this.setLayout(new BorderLayout());

        JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        p1.add(jLabel);
        p1.add(jtf);
        p1.add(btView);

        this.getContentPane().add(jsp, BorderLayout.CENTER);
        this.getContentPane().add(p1, BorderLayout.SOUTH);

        makeFile();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        showFile(e);
    }

    private void makeFile() {
        //创建一个测试文件
        File file = new File("testFile/testFileViewer.w");
        if (file.exists()) {
            System.out.println("该文件已存在");
            return;
        }
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(file);
            bw = new BufferedWriter(fw);
            int count = 0;
            for (int i = 0; i < 100; i++) {
                bw.write((char) ('A' + Math.random() * ('z' - 'A' + 1)));
                count++;
                if (count % 10 == 0) {
                    bw.newLine();
                }
            }
        } catch (IOException e1) {
            e1.printStackTrace();
        } finally {
            if (bw != null) {
                try {
                    bw.flush();
                    fw.close();
                    bw.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        }
    }


    private void showFile(ActionEvent e) {
        //读取另一个文件时，显示区应该清空
        textArea.setText("");

        if (e.getSource() == jtf || (!jtf.getText().equals("") && e.getSource() == btView)) {
            if (filename.equals(jtf.getText().trim())) {
                return;
            }
            File file1 = new File(jtf.getText().trim());
            if (!file1.exists()) {
                textArea.append("file is not existed,please check the filename");
                return;
            }
            FileReader fr = null;
            BufferedReader br = null;
            try {
                fr = new FileReader(file1);
                br = new BufferedReader(fr);
                String line;
                while ((line = br.readLine()) != null) {
                    textArea.append(line + "\n");
                }
            } catch (FileNotFoundException e1) {
                e1.printStackTrace();
            } catch (IOException e2) {
                e2.getMessage();
            } finally {
                filename = jtf.getText().trim();
                if (fr != null || br != null) {
                    try {
                        fr.close();
                        br.close();
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        FileViewer fileViewer = new FileViewer();
        fileViewer.setTitle("FileViewer");
        fileViewer.pack();
        fileViewer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fileViewer.setVisible(true);

    }
}
