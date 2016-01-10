package _9_10;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by ht on 2016/1/7.
 */
public class Exercise_9_10 {
    public static void main(String[] args) {
        int month = Integer.parseInt(args[0]);
        int year = Integer.parseInt(args[1]);

        printMonthTitle(year, month);

    }

    private static void printMonthTitle(int year, int month) {
        String str = " ";
        int numberOfDays = 0;
        switch (month) {
            case 1:
                str = "January";
                numberOfDays = 31;
                break;
            case 2:
                str = "February";
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    numberOfDays = 29;
                } else numberOfDays = 28;
                break;
            case 3:
                str = "March";
                numberOfDays = 31;
                break;
            case 4:
                str = "Apirl";
                numberOfDays = 30;
                break;
            case 5:
                str = "May";
                numberOfDays = 31;
                break;
            case 6:
                str = "Jane";
                numberOfDays = 30;
                break;
            case 7:
                str = "July";
                numberOfDays = 31;
                break;
            case 8:
                str = "August";
                numberOfDays = 31;
                break;
            case 9:
                str = "September";
                numberOfDays = 30;
                break;
            case 10:
                str = "October";
                numberOfDays = 31;
                break;
            case 11:
                str = "November";
                numberOfDays = 30;
                break;
            case 12:
                str = "December";
                numberOfDays = 31;
                break;
            default:
        }
        System.out.println("\t\t" + str + "\t\t" + year);
        System.out.println("--------------------------------");
        System.out.println("\tSun\tMon\tTue\tWed\tThu\tFri\tSat");

        printMonthBody(year, month, numberOfDays);
    }

    private static void printMonthBody(int year, int month, int numberOfDays) {
        //calendar 的月份从0开始计算
        Calendar calendar = new GregorianCalendar(year, month - 1, 1);
        int a = calendar.get(Calendar.DAY_OF_WEEK);
        for (int i = 1; i < calendar.get(Calendar.DAY_OF_WEEK); i++) {
            System.out.print("\t");
        }

        for (int i = 1; i <= numberOfDays; i++) {
            if (i < 10) {
                System.out.print("\t " + i);
            } else
                System.out.print("\t" + i);
            //判断何时换行应该是星期+天数，天数从0开始算
            if ((i - 1 + calendar.get(Calendar.DAY_OF_WEEK)) % 7 == 0) {
                System.out.println();
            }
        }
    }
}
