import java.util.Scanner;

/**
 * Created by ht on 2015/12/6.
 */
public class $5_16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入学生数量: ");
        int n = s.nextInt();
        String[] names = new String[n];
        double[] scores = new double[n];
        //录入学生的姓名和成绩
        for (int i = 0; i < n; i++) {
            System.out.println("请输入第" + (i + 1) + "个学生的姓名： ");
            names[i] = s.next();
            System.out.println("请输入第" + (i + 1) + "个学生的成绩： ");
            scores[i] = s.nextDouble();
        }
//        对学生成绩进行排序
        for (int i = 0; i < scores.length; i++) {
            for (int j = scores.length - 1; j > i; j--) {
                if (scores[i] < scores[j]) {
                    //分数排序
                    double tmp = scores[i];
                    scores[i] = scores[j];
                    scores[j] = tmp;
                    //调整姓名，使其与分数对应
                    String str = names[i];
                    names[i] = names[j];
                    names[j] = str;
                }
            }
        }

        //输出姓名数组
        for (String name : names) {
            System.out.print(name + " ");
        }
    }

}