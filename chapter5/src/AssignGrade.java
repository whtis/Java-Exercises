import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ht on 2015/11/28.
 */
public class AssignGrade {
    public static void main(String[] args) {
        List<String> students = new ArrayList<String>();
        String score = JOptionPane.showInputDialog("请输入学生的分数： ");
        while (Double.parseDouble(score) != 0) {
            students.add(score);
            score = JOptionPane.showInputDialog("请输入学生的分数： ");
        }


        Double[] scores = new Double[students.size()];
        for (int i = 0; i < students.size(); i++) {
            scores[i] = Double.parseDouble(students.get(i));
        }

        double max = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if (max < scores[i]) {
                max = scores[i];
            }
        }

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= (max - 10)) {
                System.out.println("student " + i + "score is "+ scores[i] +" and grade is A");
            } else if (scores[i] >= (max - 20)) {
                System.out.println("student " + i + "score is " + scores[i] + " and grade is B");
            } else if (scores[i] >= (max - 30)) {
                System.out.println("student " + i + "score is " + scores[i] + " and grade is C");
            } else if (scores[i] >= (max - 40)) {
                System.out.println("student " + i + "score is " + scores[i] + " and grade is D");
            } else {
                System.out.println("student " + i + "score is " + scores[i] + " and grade is E");
            }
        }
    }
}
