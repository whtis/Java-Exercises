/**
 * Created by ht on 2015/12/10.
 */
public class TestQueueInteger {
    public static void main(String[] args) {
        QueueInteger queueInteger = new QueueInteger();
        for (int i = 0; i < 10; i++) {
            queueInteger.push(i);
        }

        while (!queueInteger.empty()) {
            System.out.print(queueInteger.pop() + " ");
        }

        System.out.println();
        System.out.println(queueInteger.peek());
    }
}
