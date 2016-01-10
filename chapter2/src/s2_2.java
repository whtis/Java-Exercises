import util_chapter2.*;

/**
 * Created by w on 15-11-8.
 */
public class s2_2 {


    public static void main(String[] args) {
        double radius = Double.parseDouble((String) showInPane.Input("请输入半径："));
        double hight = Double.parseDouble((String) showInPane.Input("请输入高："));
        double square = radius * radius * Math.PI;
        double volume = square * hight;
        showInPane.prt(square);
        showInPane.prt(volume);
    }
}
