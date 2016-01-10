import java.util.*;

/**
 * Created by ht on 2015/11/17.
 */
public class $3_14 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        Scanner scanner = new Scanner(System.in);
        System.out.println( "请输入学生的数量：");
        int num = scanner.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println("请输入学生的姓名： ");
            String name = scanner.next();
            System.out.println("请输入该生的成绩： ");
            int hh = scanner.nextInt();
            map.put(name, hh);
        }

        List<Map.Entry<String, Integer>> infolds = new ArrayList<Map.Entry<String, Integer>>(map.entrySet());

        //排序
        Collections.sort(infolds, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return (o2.getValue() - o1.getValue());
//                return (o1.getKey()).toString().compareTo(o2.getKey());
            }
        });

        for (int i = 0; i < infolds.size(); i++) {
            String id = infolds.get(i).toString();
            System.out.println(id);
        }
    }
}
