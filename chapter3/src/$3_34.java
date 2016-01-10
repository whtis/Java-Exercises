import java.util.Scanner;

/**
 * Created by ht on 2015/11/20.
 */
public class $3_34 {

    private static int year = 0;

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("请输入年号： ");
        year = sca.nextInt();
        System.out.println("请输入该年第一天的星期(阿拉伯数字)： ");
        int week = sca.nextInt();
        showJanuary(week);

    }

    private static void showJanuary(int week) {
        System.out.println("\t  January\t" + year + "\t");
        System.out.println("----------------------------");
        System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");

        showWeekNumber(week,31);
        showFebruary((31 + week) % 7);

    }


    private static void showFebruary(int week) {
        System.out.println("\t February\t" + year + "\t");
        System.out.println("----------------------------");
        System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");

        if ((year % 4 == 0 && year % 100!= 0) || year % 400 == 0) {
            showWeekNumber(week, 29);
            showMarch((29 + week) % 7);
        } else {
            showWeekNumber(week, 28);
            showMarch((28 + week) % 7);
        }
    }

    private static void showMarch(int week) {
        System.out.println("\t March\t" + year + "\t");
        System.out.println("----------------------------");
        System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");

        showWeekNumber(week, 31);
        showApril((31 + week) % 7);
    }

    private static void showApril(int week) {
        System.out.println("\t April\t" + year + "\t");
        System.out.println("----------------------------");
        System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");

        showWeekNumber(week, 30);
        showMay((week + 30) % 7);
    }

    private static void showMay(int week) {
        System.out.println("\t May\t" + year + "\t");
        System.out.println("----------------------------");
        System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");

        showWeekNumber(week, 31);
        showJune((week + 31) % 7);
    }

    private static void showJune(int week) {
        System.out.println("\t June\t" + year + "\t");
        System.out.println("----------------------------");
        System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");

        showWeekNumber(week, 30);
        showJuly((week + 30) % 7);

    }

    private static void showJuly(int week) {
        System.out.println("\t July\t" + year + "\t");
        System.out.println("----------------------------");
        System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");

        showWeekNumber(week, 31);
        showAugust((week + 31) % 7);

    }

    private static void showAugust(int week) {
        System.out.println("\t August\t" + year + "\t");
        System.out.println("----------------------------");
        System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");

        showWeekNumber(week, 31);
        showSeptember((week + 31) % 7);

    }

    private static void showSeptember(int week) {
        System.out.println("\t September\t" + year + "\t");
        System.out.println("----------------------------");
        System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");

        showWeekNumber(week, 30);
        showOctober((week + 30) % 7);

    }

    private static void showOctober(int week) {
        System.out.println("\t October\t" + year + "\t");
        System.out.println("----------------------------");
        System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");

        showWeekNumber(week, 31);
        showNovember((week + 31) % 7);

    }

    private static void showNovember(int week) {
        System.out.println("\t November\t" + year + "\t");
        System.out.println("----------------------------");
        System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");

        showWeekNumber(week, 30);
        showDecember((week + 30) % 7);

    }


    private static void showDecember(int week) {
        System.out.println("\t December\t" + year + "\t");
        System.out.println("----------------------------");
        System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");

        showWeekNumber(week, 31);
    }

    private static void showWeekNumber(int week,int days) {
        switch (week) {
            case 0:
                for (int i = 1; i <= days; i++) {
                    System.out.print(i + "\t");
                    if (i % 7 == 0) {
                        System.out.println();
                    }
                }
                System.out.println();
                break;
            case 1:
                System.out.print("\t");
                for (int i = 1; i <= days; i++) {
                    System.out.print(i + "\t");
                    if (i == 6) {
                        System.out.println();
                    }
                    if (i > 7 && (i - 6) % 7 == 0) {
                        System.out.println();
                    }
                }
                System.out.println();
                break;
            case 2:
                System.out.print("\t \t");
                for (int i = 1; i <= days; i++) {
                    System.out.print(i + "\t");
                    if (i == 5) {
                        System.out.println();
                    }
                    if (i > 7 && (i - 5) % 7 == 0) {
                        System.out.println();
                    }
                }
                System.out.println();
                break;
            case 3:
                System.out.print("\t \t \t");
                for (int i = 1; i <= days; i++) {
                    System.out.print(i + "\t");
                    if (i == 4) {
                        System.out.println();
                    }
                    if (i > 7 && (i - 4) % 7 == 0) {
                        System.out.println();
                    }
                }
                System.out.println();
                break;
            case 4:
                System.out.print("\t \t \t \t");
                for (int i = 1; i <= days; i++) {
                    System.out.print(i + "\t");
                    if (i == 3) {
                        System.out.println();
                    }
                    if (i > 7 && (i - 3) % 7 == 0) {
                        System.out.println();
                    }
                }
                System.out.println();
                break;
            case 5:
                System.out.print("\t \t \t \t \t");
                for (int i = 1; i <= days; i++) {
                    System.out.print(i + "\t");
                    if (i == 2) {
                        System.out.println();
                    }
                    if (i > 7 && (i - 2) % 7 == 0) {
                        System.out.println();
                    }
                }
                System.out.println();
                break;
            case 6:
                System.out.print("\t \t \t \t \t \t");
                for (int i = 1; i <= days; i++) {
                    System.out.print(i + "\t");
                    if (i == 1) {
                        System.out.println();
                    }
                    if (i > 7 && (i - 1) % 7 == 0) {
                        System.out.println();
                    }
                }
                System.out.println();
                break;
            default:
                System.out.println();
        }
    }
}
