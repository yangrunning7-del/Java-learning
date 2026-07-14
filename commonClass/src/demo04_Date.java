import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class demo04_Date {
    public static void main(String[] args) throws ParseException {

        Date date = new Date();
        System.out.println(date);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
        System.out.println(sdf.format(date));

        // 字符串转化为时间类型
        String str = "2004/10/09  12:23:59";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
        System.out.println(sdf2.parse(str));
    }
}
