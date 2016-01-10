/**
 * Created by ht on 2015/12/12.
 */
public class $6_15 {
    public static void main(String[] args) {
        StackInteger st = new StackInteger();
        QueueInteger qu = new QueueInteger();
        boolean b = true;
        for (int i = 2; i < 120; i++) {
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    b = false;
                    break;
                }
            }
            if (b) {
                st.push(i);
                qu.push(i);
            }
            b = true;
        }

        while (!st.empty()) {
            System.out.print(st.pop() + " ");
        }
        System.out.println();
        while (!qu.empty()) {
            System.out.print(qu.pop() + " ");
        }
    }
}
