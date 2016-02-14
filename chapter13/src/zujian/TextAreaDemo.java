package zujian;

import javax.swing.*;
import java.awt.*;

/**
 * Created by ht on 2016/2/11.
 */
public class TextAreaDemo extends JFrame {
    private DescriptionPanel descriptionPanel = new DescriptionPanel();

    public TextAreaDemo() throws HeadlessException {
        descriptionPanel.setjLabelImage(new ImageIcon("image/zhangziyi.png"));
        descriptionPanel.setjLabelTitle("guojizhang");
        descriptionPanel.setjTextArea("章子怡（Zhang Ziyi），1979年2月9日出生于北京，电影演员，2000年毕业于中央戏剧学院。\n" +
                "1998年被张艺谋发掘，主演电影《我的父亲母亲》而一举成名，该片荣获第50届柏林国际电影节银熊奖。1999年主演李安导演的电影《卧虎藏龙》，该片荣获奥斯卡最佳外语片奖，因此跻身国际影坛[1]  。2005年主演斯皮尔伯格监制的好莱坞电影《艺伎回忆录》，成为首位担任好莱坞A级制作大片女主角的华人影星，该片荣获第78届奥斯卡三项大奖，她成为主演电影两度荣获奥斯卡奖的华人演员，并获得了美国电影金球奖、英国电影学院奖、美国演员工会奖影后提名[2]  ，入选当年《时代周刊》“影响世界的100人”和“中国电影百年百位优秀演员”。[3-4]  2010年亚洲电影博览会授予其“近十年亚洲最杰出女演员奖”[5]  。\n" +
                "2013~2014年，凭借《一代宗师》中\"宫二“一角而荣获第50届金马奖、第33届金像奖、第32届百花奖、亚太电影大奖、亚太电影节、亚洲电影大奖等超过12座影后大奖，[6]  荣获“大众电影百花奖、中国电影华表奖、中国电影金鸡奖、香港电影金像奖、台湾电影金马奖”等华语五大最高表演类奖的女演员[7]  ，也创造了华语影坛凭借一部电影荣膺影后次数最多的记录。[8-9] \n" +
                "自2005年起章子怡担任奥斯卡终身评委，并连续担任第77和78届奥斯卡颁奖嘉宾；2006、2009、2013年三次担任戛纳国际电影节评委。演艺事业外，章子怡担任中国电影推广大使，在海外积极参与推广宣传华语电影。");

        this.getContentPane().add(descriptionPanel);
    }

    public static void main(String[] args) {
        TextAreaDemo frame = new TextAreaDemo();
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class DescriptionPanel extends JPanel {

    private JLabel jLabelImage = new JLabel();
    private JLabel jLabelTitle = new JLabel();

    private JTextArea jTextArea = new JTextArea();

    public DescriptionPanel() {
        JPanel p = new JPanel();
        p.setLayout(new BorderLayout());
        p.add(jLabelImage,BorderLayout.CENTER);
        p.add(jLabelTitle, BorderLayout.SOUTH);

        JScrollPane jScrollPane = new JScrollPane(jTextArea);
        jScrollPane.setPreferredSize(new Dimension(400, 300));

        jLabelTitle.setHorizontalAlignment(JLabel.CENTER);

        jTextArea.setFont(new Font("Serif", Font.BOLD, 14));
        jTextArea.setLineWrap(true);
        jTextArea.setWrapStyleWord(true);
        jTextArea.setEditable(false);

        this.setLayout(new BorderLayout(5, 5));
        this.add(p, BorderLayout.WEST);
        this.add(jScrollPane, BorderLayout.EAST);
    }

    public void setjLabelTitle(String title) {
        this.jLabelTitle.setText(title);
    }

    public void setjLabelImage(ImageIcon image) {
        this.jLabelImage.setIcon(image);
        Dimension dimension = new Dimension(image.getIconWidth(), image.getIconHeight());
        this.jLabelImage.setPreferredSize(dimension);
    }

    public void setjTextArea(String textArea) {
        this.jTextArea.setText(textArea);
    }
}