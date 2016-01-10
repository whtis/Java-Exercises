/**
 * Created by ht on 2015/12/6.
 */
public class $5_25 {
    public static void main(String[] args) {
        int[][] ch = new int[8][8];
        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j < ch.length; j++) {
                ch[i][j] = (int) (Math.random() * 2);
            }
        }
        //打印棋盘
        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j < ch.length; j++) {
                System.out.print(ch[i][j] + " ");
            }
            System.out.println();
        }
        //判断行、列或对角线是否全是0
        boolean isRow = true;
        boolean isColumn = true;
        boolean isDiagonal = true;
        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j < ch.length; j++) {
                //判断行
                if (ch[i][j] != 0) {
                    isRow = false;
                }
                //判断列
                if (ch[j][i] != 0) {
                    isColumn = false;
                }
                //判断对角线
                if (ch[7 - j][7 - j] != 0) {
                    isDiagonal = false;
                } else if (ch[j][j] != 0) {
                    isDiagonal = false;
                }
            }
            if (isRow) {
                System.out.println("第" + i + "行全是0");
                isRow = true;
            }
            if (isColumn) {
                System.out.println("第" + i + "列全是0");
                isRow = true;
            }
            if (isDiagonal) {
                System.out.println("全是0存在");
                isDiagonal = true;
            }
        }
    }
}
