
/**
 * Created by ht on 2015/12/12.
 */
public class $6_7 {
    public static void main(String[] args) {
        Time time = new Time();
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());

    }
}

class Time {
    int hour;
    int minute;
    int second;

    public Time() {
        long millisSeconds = System.currentTimeMillis();
        long seconds = millisSeconds / 1000;
        second = (int) (seconds % 60);
        long minutes = seconds / 60;
        minute = (int) (minutes % 60);
        long hours = minutes / 60;
        hour = (int) (hours % 24);
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }
}