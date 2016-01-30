package _10_4;


/**
 * Created by ht on 2016/1/30.
 */
public class $10_4 {
    public static void main(String[] args) {
//        testStudent();

//        testStringList();

//        testRandomRational();

        testRandomInteger();
    }

    private static void testStudent() {
        Student[] lists = new Student[4];
        Name n1 = new Name("hi", 'm', "lilei");
        Name n2 = new Name("hei", 'f', "hanmeimei");
        Student s1 = new Student(n1, "Math");
        Student s2 = new Student(n2, "Chinese");
        Student s3 = new Student(n1, "English");
        Student s4 = new Student(n1, "Math");

        lists[0] = s1;
        lists[1] = s2;
        lists[2] = s3;
        lists[3] = s4;

        sort(lists);
    }

    private static void testStringList() {
        String[] lists = new String[4];
        String s1 = "yoyoy";
        String s2 = "dongzhen";
        String s3 = "mohun";
        String s4 = "gaoshanliushui";
        lists[0] = s1;
        lists[1] = s2;
        lists[2] = s3;
        lists[3] = s4;

        sort(lists);
    }

    private static void testRandomRational() {
        Rational[] lists = new Rational[100];
        for (int i = 0; i < lists.length; i++) {
            long n = (int) (Math.random() * 10);
            long d = (int) (Math.random() * 10);
            //d is denominator and can not be zero
            while (d == 0) {
                d = (int) (Math.random() * 10);
            }
            lists[i] = new Rational(n, d);
        }
        sort(lists);

    }

    private static void testRandomInteger() {
        Integer[] lists = new Integer[100];
        for (int i = 0; i < lists.length; i++) {
            int k = (int) (Math.random() * 100);
            lists[i] = k;
        }
        sort(lists);
    }

    /**
     * Sort an array of comparable objects
     */
    public static void sort(Object[] lists) {
        for (int i = 0; i < lists.length; i++) {
            for (int j = lists.length-1; j > i; j--) {
                if (((Comparable) lists[i]).compareTo(lists[j]) > 0) {
                    Object o = lists[i];
                    lists[i] = lists[j];
                    lists[j] = o;
                }
            }
        }


        for (int i = 0; i < lists.length; i++) {
            System.out.println(lists[i]);
        }
    }

    /**
     * return the max object in an array of comparable objects
     */
    public static Object max(Object[] lists) {
        sort(lists);
        return lists[lists.length - 1];
    }

}

