package zujian;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by ht on 2016/2/11.
 */
public class ComboBoxDemo extends JFrame implements ItemListener {

    private String[] names = {"fanbing", "libing", "zhangziyi", "zhaowei"};

    private ImageIcon[] icons = {
            new ImageIcon("image/fanbing.png"),
            new ImageIcon("image/libing.png"),
            new ImageIcon("image/zhangziyi.png"),
            new ImageIcon("image/zhaowei.png")
    };

    private String[] nameDescriptions = new String[4];

    private DescriptionPanel descriptionPanel = new DescriptionPanel();

    private JComboBox jComboBox = new JComboBox(names);

    public ComboBoxDemo() throws HeadlessException {
        nameDescriptions[0] = "范冰冰，1981年9月16日生于山东青岛，电影演员、歌手，毕业于上海师范大学谢晋影视艺术学院。1996年参演电视剧《女强人》。1998年主演电视剧《还珠格格》系列成名，2001年起投身大银幕。2004年凭借电影《手机》获得第27届大众电影百花奖最佳女主角奖。2005年发行首张个人专辑《刚刚开始》；同年主演电影《墨攻》。2007年，参演电影《心中有鬼》获得第44届台湾电影金马奖最佳女配角奖；同年凭借电影《苹果》获得第4届欧亚国际电影节最佳女演员奖";
        nameDescriptions[1] = "李冰冰（Li Bingbing），中国大陆女演员。1973年2月27日出生于黑龙江省哈尔滨市五常市，1997年毕业于上海戏剧学院表演系本科班。2000年因主演电视剧《少年包青天》而被观众所知，并主演电视剧《机灵小不懂》，凭电影《过年回家》摘得13届新加坡国际电影节最佳女主桂冠。2004年李冰冰先后参演电影《独自等待》和《天下无贼》，凭借角色刘荣和艳贼小叶分别入围金鸡奖及百花奖女配角。2005年主演电视剧《八大豪侠》。";
        nameDescriptions[2] = "章子怡（Zhang Ziyi），1979年2月9日出生于北京，电影演员，2000年毕业于中央戏剧学院。\n" +
                "1998年被张艺谋发掘，主演电影《我的父亲母亲》而一举成名，该片荣获第50届柏林国际电影节银熊奖。1999年主演李安导演的电影《卧虎藏龙》，该片荣获奥斯卡最佳外语片奖，因此跻身国际影坛[1]  。2005年主演斯皮尔伯格监制的好莱坞电影《艺伎回忆录》，成为首位担任好莱坞A级制作大片女主角的华人影星，该片荣获第78届奥斯卡三项大奖，她成为主演电影两度荣获奥斯卡奖的华人演员，并获得了美国电影金球奖、英国电影学院奖、美国演员工会奖影后提名[2]  ，入选当年《时代周刊》“影响世界的100人”和“中国电影百年百位优秀演员”。[3-4]  2010年亚洲电影博览会授予其“近十年亚洲最杰出女演员奖”[5]  。";
        nameDescriptions[3] = "赵薇（Vicki），1976年3月12日生于安徽芜湖，中国大陆女演员、歌手、导演，在影、视、歌、导四栖领域都有成就的明星。1998年凭借电视剧《还珠格格》成名，并荣获第17届中国电视金鹰奖最佳女主角奖。次年《还珠格格Ⅱ》以65%的收视率创造了中国电视剧收视记录。其后主演的《情深深雨蒙蒙》、《京华烟云》均打破央视收视记录。2001年，开始投身大银幕，相继主演的《画皮》系列、《花木兰》、《赤壁》系列、《亲爱的》、《港囧》等电影票房均过亿。";

        setDisplay(0);

        this.getContentPane().add(jComboBox, BorderLayout.NORTH);
        this.getContentPane().add(descriptionPanel, BorderLayout.CENTER);

        jComboBox.addItemListener(this);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        setDisplay(jComboBox.getSelectedIndex());
    }

    public void setDisplay(int index) {
        descriptionPanel.setjLabelTitle(names[index]);
        descriptionPanel.setjLabelImage(icons[index]);
        descriptionPanel.setjTextArea(nameDescriptions[index]);
    }

    public static void main(String[] args) {
        ComboBoxDemo frame = new ComboBoxDemo();
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
