import java.util.Arrays;

/**
 * Created by ht on 2015/12/1.
 */
public class SearchMethod {
    public static void main(String[] args) {
//        线性查找
        int[] bbb = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        Arrays.sort(bbb);
        int key = 12;
        int situation = listSearch(bbb, key);
        System.out.println(situation);

        //二分法迭代实现
        int low = 0;
        int high = bbb.length - 1;
        int aResult = binarySearch(bbb, key, low, high);
        System.out.println(aResult);

        //二分法的递归实现
        int bResult = recursiveBinarySearch(bbb, key);
        System.out.println(bResult);
    }

    private static int listSearch(int[] lists, int key) {
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] == key) {
                return i;
            }
        }
        return -1;
    }

    private static int binarySearch(int[] lists, int key, int low, int high) {
        while (low <= high) {
            if (key == lists[(high + low) / 2]) {
                return (high + low) / 2;
            } else if (key > lists[(high + low) / 2]) {
                low = ((high + low) / 2) + 1;
            } else if (key < lists[(high + low) / 2]) {
                high = ((high + low) / 2) - 1;
            }
        }
        return -low - 1;

    }

    private static int recursiveBinarySearch(int[] lists, int key) {
        int low = 0;
        int high = lists.length - 1;
        return recursiveBinarySearch(lists, key, low, high);
    }

    private static int recursiveBinarySearch(int[] lists, int key, int low, int high) {
        if (low > high) {
            return -low - 1;
        }
        int mid = (low + high) / 2;
        if (key < lists[mid]) {
            return recursiveBinarySearch(lists, key, low, mid - 1);
        } else if (key == lists[mid]) {
            return mid;
        } else
            return recursiveBinarySearch(lists, key, mid + 1, high);
    }
}
