import java.util.Scanner;

/**
 * Created by ht on 2015/11/17.
 */
public class $3_13 {
    public static void main(String[] args) {
        String output = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生的数量：");
        int num = scanner.nextInt();
        int scoreHigh = 1;
        int score = 0;
        for (int i = 0; i < num; i++) {
            System.out.println("请输入学生的姓名： ");
            String name = scanner.next();
            System.out.println("请输入该生的成绩： ");
            int hh = scanner.nextInt();
            if (hh > scoreHigh) {
                scoreHigh = hh;
                output = "成绩最高的是： " + name + "，其得分为： " + scoreHigh;
            }
        }
        System.out.println(output);
    }
}
