import java.util.Calendar;

public class demo05_Calendar {
    public static void main(String[] args) {

        // 调用抽象类Calendar的方法
        Calendar cal = Calendar.getInstance();

        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH));
        System.out.println(cal.get(Calendar.DAY_OF_WEEK));
    }
}
